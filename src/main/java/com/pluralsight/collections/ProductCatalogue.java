package com.pluralsight.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {
    private final Set<Product> products = new TreeSet<>(Product.BY_NAME);

    public Set<Product> getProducts() {
        return this.products;
    }

    public void isSuppliedBy(Supplier supplier) {
        this.products.addAll(supplier.getProducts());
    }

    public Iterator<Product> iterator() {
        return this.products.iterator();
    }

    public Set<Product> lightVanProducts() {
        return null;
    }

    public Set<Product> heavyVanProducts() {
        return null;
    }
}
