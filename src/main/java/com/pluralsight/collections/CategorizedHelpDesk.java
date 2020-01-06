package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class CategorizedHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        this.enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        final Enquiry enquiry = this.enquiries.peek();

        if (enquiry != null && enquiry.getCategory() == Category.PRINTER) {
            this.enquiries.remove();
            enquiry.getCustomer().reply("Is it out of paper?");
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = this.enquiries.peek();

        if (enquiry != null && enquiry.getCategory() != Category.PRINTER) {
            this.enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        } else {
            System.out.println("No work to do, let's have some coffee from general!");
        }
    }
}
