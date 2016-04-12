/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    
    List gList = new ArrayList();
    gList.add("hello");
     gList.add("from");
      gList.add("the");
       gList.add("otherside");
       for(Object o: gList)
            System.out.println(o);
    String two = (String) gList.get(1);
        System.out.println(two);
        
        Set gSet = new HashSet();
        gSet.add("hello");
        List ggList = new ArrayList(gSet);
        
        String g =  (String) ggList.get(0);
        
        
}
    
}
