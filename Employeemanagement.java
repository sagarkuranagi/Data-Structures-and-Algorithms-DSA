class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Manager class inherits Employee
class Manager extends Employee {

    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void display() {
        System.out.println("Manager Details");
        super.display();
    }
}

// Main class
public class Employeemanagement {
    public static void main(String[] args) {

        // Employee object
        Employee emp = new Employee(101, "Rahul");
        emp.display();

        System.out.println();

        // Manager object
        Employee mgr = new Manager(201, "Sagar");
        mgr.display();
    }
}