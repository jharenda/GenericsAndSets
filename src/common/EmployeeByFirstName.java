/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Jennifer
 */
public class EmployeeByFirstName implements Comparator<Employee> {

  

    @Override
    public int compare(Employee o1, Employee o2) {
             return new CompareToBuilder()
               .append(o1.getFirstName(), o2.getFirstName())
               .toComparison();
        
       
    } 
   
    }
    

