/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

/**
 *
 * @author Jennifer
 */
public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Hanna", 13, 10, "peanut butter cookies");
        Dog dog2 = new Dog ("Hailey", 11, -2000, "moldy bread"); 
        if (dog1.equals(dog2))
            System.out.println("dogs are equal");
        else System.out.println("clearly not equal");
    
    Dog dog3 = new Dog ("Hailey", 11, -2000, "moldy bread"); 
    if (dog3.equals(dog2))
            System.out.println("dogs are equal");
        else System.out.println("clearly not equal");
}
}
