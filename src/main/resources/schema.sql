CREATE TABLE IF NOT EXISTS netology."CUSTOMERS"
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255),
    age int NOT NULL,
    phone_number VARCHAR(255)
);
INSERT INTO netology."CUSTOMERS"(name, surname, age, phone_number)
VALUES ('Alexey', 'Ivanov', 32, +79812345678);


INSERT INTO netology."CUSTOMERS"(name, surname, age, phone_number)
VALUES ('Dmitriy', 'Petrov', 18, +79997687755);


INSERT INTO netology."CUSTOMERS"(name, surname, age, phone_number)
VALUES ('Anna', 'Vasilyeva', 65, +79765467733);

INSERT INTO netology."CUSTOMERS"(name, surname, age, phone_number)
VALUES ('Alexey', 'Tihonov', 21, +79765467733);


CREATE TABLE IF NOT EXISTS netology."ORDERS"
(
    id SERIAL PRIMARY KEY,
    date VARCHAR(255),
    customer_id integer NOT NULL,
    product_name VARCHAR(255),
    amount integer NOT NULL
);
INSERT INTO netology."ORDERS"(date, customer_id, product_name, amount)
VALUES ('12.01.2023', 3, 'Lipstic', 2);

INSERT INTO netology."ORDERS"(date, customer_id, product_name, amount)
VALUES ('16.05.2023', 1, 'Bol', 1);

INSERT INTO netology."ORDERS"(date, customer_id, product_name, amount)
VALUES ('14.09.2023', 3, 'iPhone 15', 1);

INSERT INTO netology."ORDERS"(date, customer_id, product_name, amount)
VALUES ('16.05.2023', 2, 'Tea cup', 4);

INSERT INTO netology."ORDERS"(date, customer_id, product_name, amount)
VALUES ('18.09.2023', 4, 'Milk', 1);