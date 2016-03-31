/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Objects;

/**
 *
 * @author Jennifer
 */
public class Person {
    private String fName;
    private String lName;
    private String ssn;

    public Person(String fName, String lName, String ssn) {
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.fName);
        hash = 23 * hash + Objects.hashCode(this.lName);
        hash = 23 * hash + Objects.hashCode(this.ssn);
        return hash;
    }
    @Override 
public String toString(){
    return fName + " " + lName; 
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    
    
        
    
//    
//////@Override
////public boolean equals(Object target){
//    if(target == null) return false;
//    Person p2 = (Person) target;
//    if(this.ssn.equals(p2.ssn)) return true;
//    else return false; 
//}
//    public String getfName() {
//        return fName;
//    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
}
