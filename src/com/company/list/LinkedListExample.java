package com.company.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        String designer1 = new String("Ralph Loren");
        String designer2 = new String("Karl Lagerfeld");
        String designer3 = new String("Donatella Versace");
        String designer4 = new String("Coco Chanel");
        String designer5 = new String("Hugo Boss");

        //Addition to LinkedList
        LinkedList<String> designersList = new LinkedList<>();

        designersList.addFirst(designer1);
        designersList.add(designer2);
        designersList.add(designer3);
        designersList.add(designer4);
        designersList.add(designer5);

        System.out.println(designersList);
        System.out.println("After addition LinkedList size: "
                + designersList.size() + "\n");

        //Access to item
        System.out.println("Contains method: " + designersList.contains("Coco Chanel")
                + "\nGet first item: " + designersList.getFirst()
                + "\nGet last item: " + designersList.getLast()
                + "\nGet item by index: " + designersList.get(4));

        //Change item
        System.out.println("\nList before change: " + designersList);
        designersList.add(0, "Valentino");
        System.out.println("List after change : " + designersList);

        designersList.addFirst("Valentino2");
        System.out.println("List after 2nd change: " + designersList);

        //Removal
        System.out.println("\nList size before removal: " + designersList.size());
        designersList.remove("Hugo Boss");
        designersList.removeLast();
        designersList.removeFirst();
        System.out.println("List after few removals: " + designersList);

        //Total removal
        designersList.clear();
        System.out.println("\nList size after total removal: "
                + designersList.size()); //After removal
    }
}
