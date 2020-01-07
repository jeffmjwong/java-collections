package com.pluralsight.collections;

import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityHelpDesk {
    private static final Comparator<Enquiry> BY_CATEGORY = comparing(Enquiry::getCategory);

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

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

