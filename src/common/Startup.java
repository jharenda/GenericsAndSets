package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
        
        
        Person p = new Person("Jen", "Harenda", "123-45-6532");
        Person p2 = new Person("ben", "Handa", "123-45-6532");
        Person p3 = new Person("Jen", "Harenda", "123-45-6532");
        if(p.equals(p2))
            System.out.println("eqaul ");
        
        List<Person> pers = new ArrayList<>(); 
    // transformation    
   Set<Person> persons = new HashSet<>(pers);
   
   persons.add(p); persons.add(p2); 
   persons.add(p3); 
   for (Person pa : persons) {
            System.out.println(pa);
   }
   // put back into the arraylist     
   pers = new ArrayList<>(persons);
   
        
        
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
