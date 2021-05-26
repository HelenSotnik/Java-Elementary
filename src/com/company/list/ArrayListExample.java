package com.company.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> marathonRunners = new ArrayList<>();

        //Addition of items
        System.out.println("ArrayList size before addition = " + marathonRunners.size());

        marathonRunners.add("Yuki Tokaido");
        marathonRunners.add("Hulio Ibanes");
        marathonRunners.add("Olivia Lenox");
        marathonRunners.add("Samanta Jones");
        marathonRunners.add("Nita Kiyko");
        marathonRunners.add("Vasyl Marchenko");
        marathonRunners.add("Rita Zozulia");

        System.out.println(marathonRunners);
        System.out.println("ArrayList size after addition = "
                + marathonRunners.size() + "\n");

        //Access to Item
        System.out.println("First in the ArrayList: "
                + marathonRunners.get(0));
        System.out.println("Last in the ArrrayList: "
                + marathonRunners.get(6));
        System.out.println("Contains method: "
                + marathonRunners.contains("Nita Kiyko") + "\n");

        //Change an Item
        System.out.println("Item before change: "
                + marathonRunners.get(3));
        marathonRunners.set(3, "Zina Galushko");
        System.out.println("Item after change: "
                + marathonRunners.get(3) + "\n");

        //Removal
        System.out.println("Before removal: " + marathonRunners.size());
        marathonRunners.remove(1); //by index
        marathonRunners.remove("Yuki Tokaido"); //by Object
        System.out.println("After removal: " + marathonRunners.size());

        //Total Removal
        marathonRunners.clear();
        System.out.println("After total removal: " + marathonRunners.size());
    }
}
