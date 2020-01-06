package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CategorizedHelpDesk helpDesk = new CategorizedHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
