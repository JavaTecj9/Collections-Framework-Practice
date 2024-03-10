package Collections;

import java.util.*;
import java.io.*;
public class PrintLists {

    //Method to print Collections
    public static void printList(List listName){
        for (int i = 0; i < listName.size(); i++){
            System.out.println(listName.get(i));
        }
    }
}
