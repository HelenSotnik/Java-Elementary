package com.company.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        //Vector creation and addition of items
        Vector vector = new Vector();
        vector.add("yellow");
        vector.add("white");
        vector.add("black");

        System.out.println("Vector with first items: " + vector.toString() +
                "\nVector size: " + vector.size() +
                "\nVector capacity: " + vector.capacity()); // Capacity equals 10

        //Access to items
        System.out.println("\nContains method check: ");

        vector.contains("green");
        vector.contains("yellow");

        System.out.println("Access to items by index: " + vector.get(0));


        //Change Vector
        vector.add("brown");
        vector.add("violet");
        vector.add("green");

        System.out.println("\nVector after new additions" + vector);

        String s1 = new String("blue");
        String s2 = new String("silver");
        String s3 = new String("golden");
        String s4 = new String("orange");
        String s5 = new String("chrome");

        Vector vector2 = new Vector();

        vector2.add(s1);
        vector2.add(s2);
        vector2.add(s3);
        vector2.add(s4);
        vector2.add(s5);

        //Addition of second collection
        vector.addAll(vector2);
        System.out.println("\nVector after new additions: " + vector
                + "\nVector size: " + vector.size()
                + "\nVector capacity" + vector.capacity()); //Capacity increased upto 20

        //Removal
        vector.remove(10);
        System.out.println("\nVector after removal by index: " + vector
                + "\nVector size: " + vector.size()
                + "\nVector capacity: " + vector.capacity());

        //Total removal
        vector.clear();
        System.out.println("\nVector after total removal: " + vector
                + "\nVector size: " + vector.size()
                + "\nVector capacity: " + vector.capacity());
    }
}
