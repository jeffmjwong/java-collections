package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class CategorizedHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        this.enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        final Predicate<Enquiry> predicate = enq -> enq.getCategory() == Category.PRINTER;
        final String message = "Is it out of paper?";

        processEnquiry(predicate, message);
    }

    public void processGeneralEnquiry() {
        Predicate<Enquiry> predicate = enq -> enq.getCategory() != Category.PRINTER;
        final String message = "Have you tried turning it off and on again?";

        processEnquiry(predicate, message);
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message) {
        final Enquiry enquiry = this.enquiries.peek();

        if (enquiry != null && predicate.test(enquiry)) {
            this.enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }
}
