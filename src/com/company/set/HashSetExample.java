package com.company.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> jetHashSet = new HashSet<>();

        //Addition Items to HashSet
        jetHashSet.add("Airbus 320");
        jetHashSet.add("Boeing 737-500");
        jetHashSet.add("Boeing 767");
        jetHashSet.add("Airbus 330");
        jetHashSet.add("Embraer 195");
        jetHashSet.add("Boeing 737-900NG");

        System.out.println("HashSet after addition of aircraft: ");
        System.out.println(jetHashSet);
        System.out.println("HashSet size: " + jetHashSet.size());

        //Access to Items
        System.out.println("\nContains method check: " + jetHashSet.contains("Embraer 195"));
        System.out.println();

        //Use of Iterator
        Iterator<String> stringIterator = jetHashSet.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        //Removal
        System.out.println("\nRemoval of Item in HashSet: " + jetHashSet.remove("Airbus 330"));
        System.out.println("\nHashSet size: " + jetHashSet.size());
    }
}
