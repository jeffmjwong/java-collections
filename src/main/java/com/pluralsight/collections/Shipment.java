package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        this.products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        final int index = this.products.indexOf(oldProduct);

        if (index != -1) {
            this.products.set(index, newProduct);
        }
    }

    public Iterator<Product> iterator() {
        return this.products.iterator();
    }
}
