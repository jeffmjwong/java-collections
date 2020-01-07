package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class PriorityHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        this.enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        Enquiry enquiry;
        while ((enquiry = this.enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }
}

