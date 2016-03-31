/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        
        List <String> randomList= new ArrayList<>();
     randomList.add("hike");
     randomList.add("camp");
     randomList.add("tree");
     randomList.add("lake");
     
     for (String listItem: randomList){
         System.out.println(listItem);
     }
        System.out.println("");
        System.out.println(randomList.get(2));
        randomList.add("campfire");
        randomList.remove(2);
        randomList.set(0, "pine tree");
       for (String listItem: randomList){
         System.out.println(listItem);
     }
        System.out.println("current size of list: " + randomList.size());
    }
}
