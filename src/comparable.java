/**
 * author: ellie
 * https://www.callicoder.com/java-comparable-comparator/
 *
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class comparable {

    public static void main (String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010,"Raj", 10000.00));
        employees.add(new Employee(1004, "Chris", 95000.50));
        employees.add(new Employee(1015, "David", 1340.00));

        System.out.println("Employees (Before Sorting): " + employees);

        Collections.sort(employees);

        System.out.println("Employees (After Sorting): " + employees);
    }
}
