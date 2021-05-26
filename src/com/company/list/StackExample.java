package com.company.list;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //Stack fill
        Stack<Double> num = new Stack<>();

        num.push(3.0);
        num.push(2.5);
        num.push(2.0);
        num.push(1.5);
        num.push(1.0);

        System.out.println("Current stack: " + num);

        //Access to Items
        System.out.println("\nLast item in current stack: " + num.peek());
        System.out.println("\nCheck of element position in stack: " + num.search(1.5));

        //Removal of items
        System.out.println("\nRemoval of : " + num.pop()
                + "\nRemoval of : " + num.pop()
                + "\nRemoval of : " + num.pop()
                + "\nRemoval of : " + num.pop()
                + "\nRemoval of : " + num.pop());
        System.out.println("Stack after removal of items: " + num);
        System.out.println("Check for emptiness of stack: " + num.empty());
    }
}
