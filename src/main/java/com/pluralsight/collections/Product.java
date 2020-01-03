package com.pluralsight.collections;

import java.util.Comparator;
import static java.util.Comparator.comparing;

public class Product {
    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);

    private final String name;
    private final int weight;

    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + this.name + "'" + ", weight=" + this.weight + "}";
    }
}
