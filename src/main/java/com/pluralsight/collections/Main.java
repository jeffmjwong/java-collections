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
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);
        System.out.println();

        products.sort(Product.BY_NAME);
        System.out.println(products);
        System.out.println();

        products.sort(Product.BY_WEIGHT);
        System.out.println(products);
        System.out.println();

        List<String> sg = Collections.emptyList();
        System.out.println(sg);
    }
}
