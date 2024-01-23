package studyMaterial.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*
*
* Write  a Java code keeping these points in mind:
1) There is an Employee class with attributes id as int, name as String, and department as String.
2) Create 10 different employee objects put them into 3 different departments and add these to the LinkedList.
3) Write a Stream code to segregate them according to the departments creating a list of lists for each department.
4) Write a dynamic code for this as in the future more departments can be added.
* */

public class EmployeeStreamExample {

    static class Employee {
        private int id;
        private String name;
        private String department;

        public Employee(int id, String name, String department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Create 10 different employee objects and put them into 3 different departments
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "John", "HR"));
        employees.add(new Employee(2, "Alice", "IT"));
        employees.add(new Employee(3, "Bob", "Finance"));
        employees.add(new Employee(4, "Eva", "IT"));
        employees.add(new Employee(5, "Charlie", "Sales"));
        employees.add(new Employee(6, "David", "HR"));
        employees.add(new Employee(7, "Fiona", "Finance"));
        employees.add(new Employee(8, "George", "Sales"));
        employees.add(new Employee(9, "Helen", "IT"));
        employees.add(new Employee(10, "Ivan", "HR"));

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment()));

        map.forEach((department, employeeList) -> {
            System.out.print(department + " ->");
            System.out.println(employeeList);
        });
    }

}

/*class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}*/
