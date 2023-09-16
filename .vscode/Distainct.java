

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import _42Student.Employee;

public class Distainct {
 
    private static Object Employee;

    public static void main(String[] args) {
        
      List <Employee> emp = List.of(
           new  Employee(101,"ramu","india"),
           new  Employee(102,"ram","india"),
           new  Employee(101,"san","india"),
           new  Employee(103,"ramu","india") );

        //    System.out.println(emp);

        

        Set <Employee> hm = new HashSet<>();
  
    // Set<Employee> duplicateEmployees = emp.stream()
    //             .filter(Employee ->
    //             Collections.frequency(emp, Employee) > 1)
    //             .collect(Collectors.toSet());

    List <Employee> duplicateEmployees =  emp.stream().filter(Employee -> hm.add(Employee))
                                .collect(Collectors.toList());

           duplicateEmployees.forEach( System.out :: println);                     
            //   hm.forEach(System.out :: println);
          //  System.out.println(hm);
      
    }
    
}
