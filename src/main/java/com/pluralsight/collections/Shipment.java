package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;

    private List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts = new ArrayList<>();
    private List<Product> heavyVanProducts = new ArrayList<>();

    public List<Product> getLightVanProducts() {
        return this.lightVanProducts;
    }
    public List<Product> getHeavyVanProducts() {
        return this.heavyVanProducts;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {
        final int index = this.products.indexOf(oldProduct);

        if (index != PRODUCT_NOT_PRESENT) {
            this.products.set(index, newProduct);
        }
    }

    public Iterator<Product> iterator() {
        return this.products.iterator();
    }

    public void prepare() {
        for (Product product : this.products) {
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                this.heavyVanProducts.add(product);
            } else {
                this.lightVanProducts.add(product);
            }
        }
    }
}
