### In the first round of interview some Questions related to Java was asked.

##### 1) What are Checked and Unchecked Exceptions.
    

##### 2) Give examples of Checked and Unchecked Exceptions.
##### 3) What is Thread Lifecycle

In Java, a thread goes through various states during its lifecycle. The thread lifecycle in Java is represented by the Thread.State enum, and the primary states are:

**New**:
A thread is in the "New" state when an instance of the Thread class is created but the start() method is not yet called.
The thread is not considered alive at this point.

**Runnable**:
A thread is in the "Runnable" state when the start() method is called, and the thread is ready to run. However, it doesn't mean the thread is currently executing; it simply indicates that the thread is eligible to run.

**Blocked**:
A thread is in the "Blocked" state when it is temporarily inactive. This occurs when a thread is waiting for a monitor lock to enter a synchronized block or method.

**Waiting**:
A thread is in the "Waiting" state when it waits for another thread to perform a particular action. For example, a thread can enter this state by calling the Object.wait() method or waiting on a condition variable.

**Timed Waiting**:
Similar to the "Waiting" state, a thread enters the "Timed Waiting" state when it is waiting for another thread to perform a particular action, but with a specified maximum time duration. This can happen when calling methods like Thread.sleep() or Object.wait(timeout).

**Terminated**:
A thread is in the "Terminated" state when it has completed its execution. This can happen when the run() method completes, or an uncaught exception is thrown during execution
##### 4) What is a communication Pool.

**Connection Pool:**

A connection pool is a cache of database connections that are reused, rather than being opened and closed for each new request. This is commonly used in applications that interact with databases to improve performance.
In Java, libraries like Apache Commons DBCP, C3P0, and HikariCP are used to implement connection pooling. These libraries manage a pool of database connections, allowing multiple threads or components to share and reuse connections efficiently.

##### 5) What is Aggregation and Composition

**Aggregation**:

* Aggregation is a "has-a" relationship, where one class has a reference to another class, but the objects involved can exist independently.
* It represents a weaker relationship. The objects can exist independently of each other, and the relationship is typically more casual.
* In an aggregation relationship, if the container (whole) is destroyed, the contained object (part) can still exist.
* Aggregation is often represented by a diamond-shaped line with an arrow pointing to the "whole" class.

Example:
```
class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    // Other attributes and methods
}

class University {
    List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Other attributes and methods
}

In this example, University has a list of Department objects. The relationship is an aggregation,
and Department objects can exist independently of the University.

```

**Composition**:

* Composition is a stronger form of association where one class is composed of another class, and the composed object cannot exist independently.
* It represents a "whole-part" relationship, where the existence of the part is dependent on the existence of the whole.
* In composition, if the container (whole) is destroyed, the contained object (part) is also destroyed.
* Composition is often represented by a filled diamond-shaped line with an arrow pointing to the "whole" class.

Example:

```
class Engine {
    // Some attributes and methods
}

class Car {
    Engine carEngine;

    public Car() {
        this.carEngine = new Engine();
    }

    // Other attributes and methods
}

In this example, Car has an Engine object as a part of its composition. 
The Engine object is created within the Car constructor, and the existence of the Engine is dependent on the existence of the Car. If the Car is destroyed, the Engine is also implicitly destroyed.
```

##### 6) What is static and Dynamic Binding

**Static Binding:**
Static Binding (also known as Early Binding or Compile-time Binding):

* In static binding, the type of method call is determined at compile-time.
* It means that the method to be invoked is resolved at compile-time based on the type of the reference variable, not at runtime.
* Static binding is typically associated with method overloading (compile-time polymorphism).
* Examples of static binding include method calls for overloaded methods or static methods.

```
class StaticBindingExample {
    void display(int x) {
        System.out.println("Displaying integer: " + x);
    }

    void display(String s) {
        System.out.println("Displaying string: " + s);
    }

    public static void main(String[] args) {
        StaticBindingExample example = new StaticBindingExample();
        example.display(10);        // Static binding based on the type of the argument
        example.display("Hello");   // Static binding based on the type of the argument
    }
}

```

**Dynamic Binding**:
Dynamic Binding (also known as Late Binding or Runtime Binding):

* In dynamic binding, the type of method call is determined at runtime.
* It allows for method overriding and is associated with runtime polymorphism.
* The decision about which method to call is made at runtime based on the actual type of the object being referred to, not the type of the reference variable.
* Dynamic binding is achieved through method overriding, where a subclass provides a specific implementation for a method defined in its superclass.

```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Dynamic binding based on the actual type (Dog) at runtime
        animal.sound();             // Calls the overridden method in Dog class
    }
}

```

##### 7) What are OOPS Concepts.
##### 8) Explain about TreeSet.
##### 9) Different types of Annotations of Spring Boot.
##### 10) What is finalize.
##### 11) What is the final Keywords
##### 12) Different kinds of HTTPS status code
