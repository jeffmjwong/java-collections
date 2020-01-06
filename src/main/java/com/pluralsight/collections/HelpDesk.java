package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        this.enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        while (!this.enquiries.isEmpty()) {
            final Enquiry enquiry = this.enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }
}
