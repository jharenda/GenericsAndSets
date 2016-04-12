/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jennifer
 */
public class RandomPractice {
    public static void main(String[] args) {
        
    
Set <String> set1 = new HashSet<>();
set1.add("hello");
//set1.add("hello");
set1.add("hello");
set1.add("from the");
set1.add("a");
set1.add("otherside");
for (String s: set1)
            System.out.println(s);

    Set<String> set2 = new TreeSet<>();
    //tree
    //set2.add("hello");
set2.add("what");
set2.add("hello");
set2.add("from the");
set2.add("a");
set2.add("otherside");
for(String ts: set2)
            System.out.println(ts);
        System.out.println("\n");
    Set <String> set3 = new HashSet<>();


set3.add("Otherside");
set3.add("from the");
set3.add("a");
set3.add("ello");
  System.out.println("\n");
for (String sS: set3)
            System.out.println(sS);

     System.out.println("\n");
      Set<String> set = new LinkedHashSet<String>();
      set.add("Otherside");
set.add("from the");
set.add("a");
set.add("Hello");
for (String s: set)
            System.out.println(s);
}
}