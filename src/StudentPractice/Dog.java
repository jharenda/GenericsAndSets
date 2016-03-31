/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPractice;

import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public class Dog {
    private String name;
    private int age;
    private int intellegenceRating;
    private String favoriteFood; 

    public Dog(String name, int age, int intellegenceRating, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.intellegenceRating = intellegenceRating;
        this.favoriteFood = favoriteFood;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.age;
        hash = 67 * hash + this.intellegenceRating;
        hash = 67 * hash + Objects.hashCode(this.favoriteFood);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.intellegenceRating != other.intellegenceRating) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.favoriteFood, other.favoriteFood)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + ", intellegenceRating=" + intellegenceRating + ", favoriteFood=" + favoriteFood + '}';
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIntellegenceRating() {
        return intellegenceRating;
    }

    public void setIntellegenceRating(int intellegenceRating) {
        this.intellegenceRating = intellegenceRating;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    
     
    
}
