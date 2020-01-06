package com.pluralsight.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {
    private final SortedSet<Product> products = new TreeSet<>(Product.BY_WEIGHT);

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
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return this.products.headSet(heaviestLightVanProduct);
    }

    public Set<Product> heavyVanProducts() {
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return this.products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for (Product product : this.products) {
            if (product.getWeight() > 20) {
                return product;
            }
        }

        return this.products.last();
    }
}
