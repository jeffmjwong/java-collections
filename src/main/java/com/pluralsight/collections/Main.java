package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final List<Product> products = new ArrayList<>();
        Collections.addAll(products, ProductFixtures.door, ProductFixtures.floorPanel, ProductFixtures.window);
        System.out.println(Collections.min(products, Product.BY_NAME));
        System.out.println(Collections.max(products, Product.BY_WEIGHT));

        System.out.println(products);
        System.out.println();

        products.sort(Product.BY_NAME);
        System.out.println(products);
        System.out.println();

        products.sort(Product.BY_WEIGHT);
        System.out.println(products);
        System.out.println();

        List<String> sg = Collections.singletonList("hello");
        System.out.println(sg);
    }
}
