package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    public String getName() {
        return this.name;
    }
    public List<Product> getProducts() {
        return this.products;
    }

    public Supplier(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" + "name='" + name + "'" + ", products=" + products + '}';
    }
}
