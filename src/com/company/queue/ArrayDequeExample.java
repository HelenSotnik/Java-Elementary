package com.company.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<String> footballTeam = new ArrayDeque<>();

        //Addition of Items
        footballTeam.addFirst("Real Madrid");
        footballTeam.addLast("Dinamo");

        //Push method
        footballTeam.push("Liverpool");//push element first anyway

        footballTeam.add("Manchester United");
        footballTeam.add("Barcelona");
        footballTeam.add("Juventus");

        System.out.println("ArrayDeque presentation: " + footballTeam);
        System.out.println(footballTeam.size());

        //Access to Items in ArrayDeque
        String firstItem = footballTeam.getFirst();
        System.out.println("First item in ArrayDeque: " + firstItem); //First Item

        String lastItem = footballTeam.getLast();
        System.out.println("\nLast item in ArrayDeque: " + lastItem); //Last Item

        System.out.println("\nQueue size: " + footballTeam.size());
        System.out.println();

        //Removal
        System.out.println(footballTeam.remove("Barcelona"));
        System.out.println();
        footballTeam.removeFirst();
        footballTeam.removeLast();
        System.out.println(footballTeam);

        //Presentation of Queue Items with removal
        while (footballTeam.peek() != null) {
            System.out.println(footballTeam.pop());
        }

        //IsEmpty Method Check
        System.out.println("IsEmpty Method Check: " + footballTeam.isEmpty());
    }
}
