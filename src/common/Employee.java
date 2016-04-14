package common;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable {

    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.ssn);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + ssn;
    }

    @Override
    public int compareTo(Object other) {
        Employee o = (Employee) other;
        return new CompareToBuilder()
                .append(this.ssn, o.ssn)
                .toComparison();

    }

    public static void main(String[] args) {
        // make 4 employees
        Employee e1 = new Employee("Smith", "Jill", "222-11-1111");
        // e2 will replace e1 in an map because they have the same key. Jill Smith shouldn't exist any more. 
        Employee e2 = new Employee("Smithe", "Bill", "222-11-1111");
        Employee e3 = new Employee("Green", "Paul", "111-22-2222");
        Employee e4 = new Employee("Cash", "Alice", "111-11-3333");

        // put employees in a hashMap
        //map name should be plural(employees) 
        Map<String, Employee> employeeMap = new HashMap<>();

        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);
        employeeMap.put(e2.getSsn(), e2);

        // get an employee by key
        System.out.println("\nGetting employee by key");
        Employee emp1 = employeeMap.get(e1.getSsn());
        System.out.println(emp1.getFirstName());

        Employee emp2 = employeeMap.get(e2.getSsn());
        System.out.println(emp2);
        Employee emp3 = employeeMap.get(e3.getSsn());
        System.out.println(emp3.getFirstName());
        Employee emp4 = employeeMap.get(e4.getSsn());
        System.out.println(emp4.getFirstName());
  
// put keys in a set and then loop through those. 
        System.out.println("\n Looping through keys, put into a set first");
        Set<String> keys = employeeMap.keySet();
        for (String key : keys) {
            Employee found = employeeMap.get(key);
            System.out.println(found);
        }

// loop through values 
        System.out.println("\nLoop through values of HashMap:");
        Collection<Employee> v = employeeMap.values(); 
        for (Employee em : v) {
            System.out.println(em);
        }
//Tree map- tree map only sort by key
        Map<String, Employee> treeMap = new TreeMap<>();
        treeMap.put(e1.getSsn(), e1);
        treeMap.put(e3.getSsn(), e3);
        treeMap.put(e4.getSsn(), e4);
        treeMap.put(e2.getSsn(), e2);
        // Loop through keys
        System.out.println("\nLoop through keys of treeMap. Should be sorted by ssn?:");
        for (String key : treeMap.keySet()) {
            System.out.println(treeMap.get(key));
        }

        // Loop through values
        System.out.println("\nLoop through values:");
        for (Employee emp : treeMap.values()) {
            System.out.println(emp.getLastName());
        }
        TreeSet<Employee> treeSet = new TreeSet<>();

        System.out.println("\nTree set no dupes: ");
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e1);
        for (Employee em : treeSet) {
            System.out.println( "hello " + em);
        }

        System.out.println("\nOrdered by first name (alternative sort):");
        TreeSet<Employee> treeSet2;
        treeSet2 = new TreeSet<Employee>(new EmployeeByFirstName());
        treeSet2.addAll(treeSet);

        for (Employee eSortedByFirst : treeSet2) {
            System.out.println(eSortedByFirst);
        }
        List<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        for (Employee e : arrayList) {
            System.out.println("\n arrayList: " + e.lastName);
        }
        System.out.println("\n 4 employees in arrayList trasferred to set:");
        Set<Employee> set3 = new HashSet<>(arrayList);
        for (Employee set3emp : set3) {
            System.out.println(set3emp.lastName);
        }
 System.out.println("\nUsing a collection of values, get the Employees...");
        Collection values = treeMap.values();
        for(Object emp : values) {
            System.out.println((Employee)emp);
        }

        List <Employee> eL = new ArrayList<>(values);
        Collections.sort(eL, new EmployeeByFirstName()); 
        System.out.println(eL);
    }

}
