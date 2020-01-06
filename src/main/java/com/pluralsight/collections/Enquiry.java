package com.pluralsight.collections;

public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Customer getCustomer() {
        return this.customer;
    };
    public Category getCategory() {
        return this.category;
    }

    public Enquiry(Customer customer, Category category) {
        this.customer = customer;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Enquiry{" + "customer='" + this.customer + "'" + ", category=" + this.category + "}";
    }
}
