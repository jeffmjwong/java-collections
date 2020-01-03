package com.pluralsight.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable {
    private final Set<Product> products = new HashSet<>();

    public Set<Product> getProducts() {
        return this.products;
    }

    public void isSuppliedBy(Supplier supplier) {
        this.products.addAll(supplier.getProducts());
    }

    public Iterator<Product> iterator() {
        return this.products.iterator();
    }
}
