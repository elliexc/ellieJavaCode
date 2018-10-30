/**
 * author: Ellie
 *
 */

//import java.time.LocalDate;
import java.util.Objects;


class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;
//    private LocalDate joiningDate;

    public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
//            this.joiningDate = joiningDate;
        }

    public int getId() {
            return id;
        }

    public void setId(int id){
            this.id = id;
        }

    public String getName()
        {
            return name;
        }
    public void setName(){
            this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){

        this.salary = salary;
    }

//    public LocalDate getLocalDate(){
//        return joiningDate;
//    }
//
//    public void setJoiningDate(){
//        this.joiningDate = joiningDate;
//    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if(this.getId() < anotherEmployee.getId()) {
            return -1;
        } else if(this.getId() > anotherEmployee.getId()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o ) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public String toString() {
        return "Employee {" +
                " Name= " + name +
                " id= " + id +
                " Salary= " + salary +
                '}';

    }

 }


