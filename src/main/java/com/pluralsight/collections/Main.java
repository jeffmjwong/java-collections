package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Set<Product> products = new HashSet<>();
        System.out.println(products);
        final Product glassDoor = new Product("Glass Door", 50);
        products.add(glassDoor);
        products.add(glassDoor);
        products.add(glassDoor);
        products.add(glassDoor);
        products.add(glassDoor);
        products.add(glassDoor);

        System.out.println(products);
    }
}
