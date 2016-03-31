package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Jennifer
 */
public class ListDemo1 {
    public static void main(String[] args) {
        //doesn't use LSP, should avoid 
      // ArrayList shoppingList = new ArrayList();
      // better
       List <String> shoppingList= new ArrayList<>(); 
       // can add integer since JDK 5- autoboxing
       // cna only store objects in lists- no primatives (not based on classes)
       // performs autoboxing 
       // shoppingList.add(5);
       // boixing
      // shoppingList.add(new Integer(5));
      //list can store duplicate items (not in a set).
      //can only store ojbects- string, tickects, dogs, employees, etc. 
      shoppingList.add("Red Wine");
      shoppingList.add("Oatmeal");
      shoppingList.add("Grapefruit");
      shoppingList.add("Red Wine");
      // dont need to cast anymore 
      //String item = (String)shoppingList.get(1);
      // generics- since jdk 5  metadata 
      // retrive
      String item = shoppingList.get(1);
      // default start arraylist size is 10
      int size = shoppingList.size(); 
      shoppingList.add(1, "tea");
      shoppingList.set(1, "cake"); 
      shoppingList.remove(2); 
      
//      for (int i = 0; i < shoppingList.size(); i++){
//          String items = (String)shoppingList.get(i);
//          String items = shoppingList.get(i);
//          System.out.println(items);
//      }
//       if you don't need the counter 
//      for (String items: shoppingList){
//          System.out.println(items);
//      }
//      
//      Iterator <String>i = shoppingList.iterator(); 
//      while (i.hasNext()) {
//          String items = i.next();
//          System.out.println(items);
//      }
          
      Set <String> shoppingList2= new HashSet<>(); 
        shoppingList2.add("Red Wine");
      shoppingList2.add("Oatmeal");
      shoppingList2.add("Grapefruit");
      shoppingList2.add("Red Wine");
       for (String items: shoppingList2){
        System.out.println(items);
      }
//      
    }
    
}
