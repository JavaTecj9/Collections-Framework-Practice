package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Create new ArrayList
        ArrayList<String> newList = new ArrayList<String>();
        //Set values with .add
        newList.add("Cereal");
        newList.add("Bread");
        newList.add("Milk");
        newList.add("Juice");
        newList.add("Apple");
        newList.add("Bacon");
        newList.add("Cheese");
        newList.add("Candy");
        //remove values with .remove
        newList.remove(2); //Remove "Milk" from the ArrayList

        //Print list on one line to console
        System.out.println(newList);

        //Use enhanced loop to print ArrayList
        for (String list : newList){
            System.out.println(list);
        }

        //Create new LinkedList
        LinkedList<Integer> newLinkedList = new LinkedList<Integer>();
        newLinkedList.add(45);
        newLinkedList.add(65);
        newLinkedList.add(91);
        newLinkedList.add(23);
        newLinkedList.add(14);

        //Print list with enhanced loop
        for (int number : newLinkedList) {
            System.out.println(number);
        }
        //System.out.println(newLinkedList);

        //print lists with method in class PrintLists
        System.out.println("\n");

        PrintLists.printList(newLinkedList);
        PrintLists.printList(newList);
    }
}