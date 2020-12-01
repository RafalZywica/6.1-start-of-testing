package com.kodilla.good.patterns.foof2door;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private static String name;
    private static List<Product> productList = new ArrayList<>();
    private static Product product1;

    public Producer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct(String productName) {
        for (Product product: productList) {
            if (product.getName().equals(productName)) {
                product1 = product;
            }
        }
        return product1;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }
}
