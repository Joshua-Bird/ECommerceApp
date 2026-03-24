/*
 * Product.java
 * Product model class
 * Author: Plamedie 230082629
 * Date: 04 March 2026
 */
package domain;

// Import Category if you have the class file, otherwise keep it as is until integrated
// import domain.Category;

import jdk.jfr.Category;

public class Product {
    private final String productId;
    private final String name;
    private final double price;
    private final String description;
    private int quantity;
    private Category category;

    // Private constructor for Builder Pattern
    private Product(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.quantity = builder.quantity;
        this.category = builder.category;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    // Setter for quantity (as it might change independently of construction)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Builder Class
    public static class Builder {
        private String productId;
        private String name;
        private double price;
        private String description;
        private int quantity;
        private Category category;

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Product build() {
            // Optional: Add validation here if needed
            return new Product(this);
        }
    }
}
