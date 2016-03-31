/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jennifer
 */
public class SetPractice {
    public static void main(String[] args) {
        
    // first make arrayList- use this for storage
     List<String> list = new ArrayList<>();
        list.add("Simba");
        list.add("Timon");
        list.add("Scar");
        list.add("Simba"); 
        list.add("Mufasa");
        list.add("Nala");
        list.add("Rafiki");
        list.add("Pumba");
  
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println("-------");
        // put arrayList into a set, which will remove duplicates. Also maintains the order of insertion
        // Sets should be used for "transformations", not storage(like arrayList)
            Set<String> set = new LinkedHashSet<String>(list);
           for(String item : set) {
            System.out.println(item);
        }
           System.out.println("------");
           // Just hash (not linked) will not guarentee insertion order
        Set<String> notLinked = new HashSet<String>(list); 
           for(String item : notLinked) {
            System.out.println(item);
        }
}
}