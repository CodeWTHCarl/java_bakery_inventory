--jonathan

-- Step 1: Create and select the database
CREATE DATABASE IF NOT EXISTS bakery_db;
USE bakery_db;


-- TABLE 1: categories
-- Purpose: Stores product categories (e.g., Bread, Pastry)
-- This is the PARENT table
CREATE TABLE IF NOT EXISTS categories (
    id   INT          NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,

    CONSTRAINT pk_categories PRIMARY KEY (id)
);

-- TABLE 2: products
-- Purpose: Stores all bakery inventory items
-- This is the CHILD table — references categories via FK
CREATE TABLE IF NOT EXISTS products (
    id          INT            NOT NULL AUTO_INCREMENT,
    name        VARCHAR(150)   NOT NULL,
    category_id INT            NOT NULL,
    price       DECIMAL(10, 2) NOT NULL,
    stock       INT            NOT NULL DEFAULT 0,

    CONSTRAINT pk_products     PRIMARY KEY (id),
    CONSTRAINT fk_category     FOREIGN KEY (category_id)
                               REFERENCES categories(id)
                               ON DELETE RESTRICT
                               ON UPDATE CASCADE
);

-- SAMPLE DATA: Categories
INSERT INTO categories (name) VALUES
    ('Bread'),
    ('Pastry'),
    ('Cake'),
    ('Cookies'),
    ('Drinks');

-- SAMPLE DATA: Products
INSERT INTO products (name, category_id, price, stock) VALUES
    ('Pandesal',          1, 5.00,  100),
    ('Spanish Bread',     1, 8.00,  80),
    ('Ensaymada',         2, 25.00, 50),
    ('Cheese Roll',       2, 20.00, 60),
    ('Chocolate Cake',    3, 350.00,10),
    ('Ube Cheese Pandesal',1, 15.00, 75),
    ('Peanut Cookies',   4, 30.00, 40),
    ('Broas',            4, 45.00, 35),
    ('Hot Chocolate',    5, 50.00, 30),
    ('Buko Pandan Cake', 3, 320.00, 8);
