import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * author: Ellie
 * date  : 2018-10-15 1:59 PM
 *
 */
public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00));
        employees.add(new Employee(1004, "Chris", 95000.50));
        employees.add(new Employee(1015, "David", 134000.00));
        employees.add(new Employee(1009, "Steve", 100000.00));

        System.out.println("Employees : " + employees);

        // Sort employees by Name
        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        Collections.sort(employees, employeeNameComparator);
        System.out.println("\n Employee (Sorted by Name):" + employees);

        // Sort employees by Salary
        Comparator<Employee> employeeSalaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() < e2.getSalary()) {
                    return -1;
                } else if(e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(employees, employeeSalaryComparator);
        System.out.println("\n Employee (Sorted by Salary):" + employees);

    }
}