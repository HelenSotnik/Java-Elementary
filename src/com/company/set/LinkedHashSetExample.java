package com.company.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(7);

        //Addition elements to LinkedHashSet
        linkedHashSet.add("Monday");
        linkedHashSet.add("Tuesday");
        linkedHashSet.add("Wednesday");
        linkedHashSet.add("Thursday");
        linkedHashSet.add("Friday");

        System.out.println("LinkedHashSet after addition:");
        System.out.println(linkedHashSet);

        //Change of LinkedHashSet
        linkedHashSet.add("Saturday");
        linkedHashSet.add("Monday");
        System.out.println("\nLinkedHashSet after new addition:");
        System.out.println(linkedHashSet);//Monday already exists -> not added to set
        linkedHashSet.add("Sunday");

        System.out.println("LinkedHashSet size: " + linkedHashSet.size());

        //Access to Items
        System.out.println("\nContains method check: "
                + linkedHashSet.contains("Saturday"));

        //Use of Iterator
        Iterator iterator = linkedHashSet.iterator();
        System.out.println();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " \n");

        //Presentation of elements other way
        System.out.println();
        for (String lhs : linkedHashSet)
            System.out.print(lhs + " \n");

        //Removal
        System.out.println("\nAfter removal: " + linkedHashSet.remove("Monday"));
        System.out.println(linkedHashSet);
        System.out.println("LinkedHashSet size: " + linkedHashSet.size());
        System.out.println("Removal of unexisting element gives result: "
                + linkedHashSet.remove("MMMMMM"));
    }
}
