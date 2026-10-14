
package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    // No-argument constructor required for JSON requests
    public Product() {
    }

    // Constructor used in earlier tutorials
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
