package com.example.jdbc_template.controller;

import com.example.jdbc_template.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    DataRepository dataRepository;

    public Controller(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        return dataRepository.getProductName(name);
    }
}
