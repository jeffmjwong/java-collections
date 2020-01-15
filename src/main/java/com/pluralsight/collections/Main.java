package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Map<Integer, Product> idToProduct = new HashMap<>();

        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println();

        final Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, Product> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
//            entry.setValue(ProductFixtures.door);
        }
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        final Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProduct);
        System.out.println();
    }
}
