### These are some of the SQL questions asked in the 1st round of interview in EMIDS
1)Write a select statement that shows all books and the authors who have written them,
   if the book has an author assigned to it and the book title begins with the letter 'T'.

Tables:
Author: author_id, ssn, first_name, last_name, ...
Book: isbn, title, pub_id, ...
BookAuthor: isbn, author_id, ...
Publisher: pub_id, name, address

```sql
SELECT b.title AS book_title, a.first_name AS author_first_name, a.last_name AS author_last_name
FROM Book b
JOIN BookAuthor ba ON b.isbn = ba.isbn
JOIN Author a ON ba.author_id = a.author_id
WHERE b.title LIKE 'T%';
```

2) Consider a scenario where a library maintains information about books and authors.
   A book can have multiple authors and an author can write multiple books.
   How would you design the tables to represent this relationship?

```agsl
CREATE TABLE Author (
    author_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    -- Other author details
);

CREATE TABLE Book (
    isbn VARCHAR(13) PRIMARY KEY,
    title VARCHAR(100),
    pub_id INT,
    -- Other book details
    FOREIGN KEY (pub_id) REFERENCES Publisher(pub_id)
);

CREATE TABLE BookAuthor (
    isbn VARCHAR(13),
    author_id INT,
    PRIMARY KEY (isbn, author_id),
    FOREIGN KEY (isbn) REFERENCES Book(isbn),
    FOREIGN KEY (author_id) REFERENCES Author(author_id)
);

```

3) What are Cursors and Triggers?

```agsl
Cursors:
Cursors are database objects used to retrieve data from a result set one row at a time, 
allowing for processing row by row instead of fetching the entire result set at once. 
They are commonly used in stored procedures and triggers.

Triggers:
Triggers are database objects that automatically perform actions (such as insert, update, delete) 
in response to specified events (such as data modifications) on a particular table. 
Triggers are executed implicitly when a triggering event occurs and can be used to enforce business rules, 
maintain data integrity, or perform logging operations.
```


### These are some of the Java Questions:

1) What will be output of the following java code snippet:

```java
String str = "abc";
str = str + "def";
System.out.println(str);

abcdef

```

2) In the above code how many Objects are getting created?

In the above code snippet, three objects are created:

- One for the string "abc" which is stored in the string pool.
- One for the string "def" which is also stored in the string pool.
- One for the concatenated string "abcdef", which is created due to the concatenation operation and stored in the string pool.

3) Difference between Comparator and Comparable?

### Comparator vs Comparable

1. **Comparable:**

    - **Definition:**
        - The `Comparable` interface is used to define the natural ordering of objects.
        - The class whose objects are being compared must implement the `Comparable` interface and override the `compareTo` method.

    - **Method:**
        - The `compareTo` method is used to define the natural ordering of objects.
        - It returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object, respectively.

    - **Example:**
      ```java
      public class MyClass implements Comparable<MyClass> {
          // Fields and methods...
 
          @Override
          public int compareTo(MyClass other) {
              // Comparison logic...
          }
      ```
2. **Comparator:**

    - **Definition:**
        - The `Comparator` interface is used to define a custom ordering of objects.
        - It is often used when the class of objects being compared does not implement the `Comparable` interface or when a different ordering is needed.

    - **Method:**
        - The `compare` method is used to compare two objects.
        - It returns a negative integer, zero, or a positive integer if the first argument is less than, equal to, or greater than the second.

    - **Example:**
      ```java
      public class MyComparator implements Comparator<MyClass> {
          // Fields and methods...
 
          @Override
          public int compare(MyClass obj1, MyClass obj2) {
              // Custom comparison logic...
          }
      ```
3. **Usage:**
    - Use `Comparable` when you want to define the natural ordering of a class.
    - Use `Comparator` when you want to define a custom ordering or when dealing with classes that do not implement `Comparable`.

In summary, `Comparable` is for the natural ordering of objects within the class itself, while `Comparator` allows for external custom ordering of objects.


Q) Write a Java code to sort the list of Employees By Last name in Descending order?

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
    
    public class EmployeeSortingExample {
    
        public static void main(String[] args) {
            // Sample list of employees
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("John", "Doe"));
            employeeList.add(new Employee("Jane", "Smith"));
            employeeList.add(new Employee("Robert", "Johnson"));
    
            // Sorting the list by last name in descending order
            Collections.sort(employeeList, Comparator.comparing(Employee::getLastName).reversed());
    
            // Displaying the sorted list
            for (Employee employee : employeeList) {
                System.out.println(employee.getLastName() + ", " + employee.getFirstName());
            }
        }
    
        static class Employee {
            private String firstName;
            private String lastName;
    
            public Employee(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
    
            public String getFirstName() {
                return firstName;
            }
    
            public String getLastName() {
                return lastName;
            }
        }
    }
