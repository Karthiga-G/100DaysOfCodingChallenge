## Challenge

A table called sweet is created with the following DDL command:
```sql
CREATE TABLE sweet (id INT, name VARCHAR(30), mainingredients VARCHAR(100), price INT);

## Solution

SELECT id, name, price 
FROM sweet 
WHERE mainingredients LIKE '%milk%' OR mainingredients LIKE '%Milk%' 
ORDER BY price ASC;
