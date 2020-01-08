package com.pluralsight.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int r = calculator.evaluate("10 - 3 + 1 + 12");
        System.out.println(r);
    }
}
