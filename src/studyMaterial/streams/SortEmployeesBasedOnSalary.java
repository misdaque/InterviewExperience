package studyMaterial.streams;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
*
* Write a java code using Streams to sort the list of Employees having id, name, location, salary
* as attributes. Sort in Descending order.
 * */
public class SortEmployeesBasedOnSalary {

    static class Employee {
        private int id;
        private String name;
        private String location;
        private double salary;

        // Constructor, getters, and setters

        public Employee(int id, String name, String location, double salary) {
            this.id = id;
            this.name = name;
            this.location = location;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getLocation() {
            return location;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "New York", 80000.0),
                new Employee(2, "Alice", "London", 75000.0),
                new Employee(3, "Bob", "San Francisco", 90000.0)
                // Add more employees as needed
        );

        // Sort the list in descending order based on salary using Streams
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble((Employee employee) -> employee.getSalary()).reversed())
                .toList();

        // Display the sorted list
        sortedEmployees.forEach(System.out::println);
    }

}
