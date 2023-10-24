package com.example.jdbc_template.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class DataRepository {

    private String sql;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DataRepository() {
        sql = DataRepository.read("select.sql");
        System.out.println(sql);
        jdbcTemplate = new JdbcTemplate();
    }

    public List<String> getProductName(String nameSql){
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            String productName = rs.getString("product_name");
            return productName;
        }, nameSql);
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
