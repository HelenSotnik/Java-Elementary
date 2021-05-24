package com.company.set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        //Addition of Items
        treeSet.add("Sportmaster");
        treeSet.add("Puma");
        treeSet.add("Megasport");
        treeSet.add("Nike");
        treeSet.add("Intersport");
        treeSet.add("UnderArmour");
        treeSet.add("Adidas");

        System.out.println("TreeSet sorted after addition ascending: \n"
                + treeSet);
        System.out.println("TreeSet size: " + treeSet.size());

        //Access to Items
        System.out.println("\nTreeSet Lower Element: " + treeSet.first());
        System.out.println("\nTreeSet Higher Element: " + treeSet.last());

        System.out.println();
        System.out.println(treeSet.contains("Puma")); //true
        System.out.println(treeSet.contains("Reebok")); //false

        //Iterator Use
        Iterator iterator = treeSet.iterator();

        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Removal
        treeSet.remove("Adidas");
        System.out.println("\nTreeSet size after 1 element removal: "
                + treeSet.size());

        //Total Removal
        treeSet.clear();
        System.out.println("\nTreeSet sorted after total removal: "
                + treeSet);
        System.out.println("TreeSet size: " + treeSet.size());

        //Empty
        System.out.println("\nIsEmptyMethod check: " + treeSet.isEmpty()); //true
    }
}
