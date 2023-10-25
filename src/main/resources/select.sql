SELECT product_name
FROM netology."ORDERS"
WHERE customer_id IN (SELECT id FROM netology."CUSTOMERS" WHERE name ILIKE (:name));