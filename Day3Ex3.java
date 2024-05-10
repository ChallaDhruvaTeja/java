class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Main St, City";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 40;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Park Ave, Town";
        manager.salary = 80000.0;
        manager.department = "Human Resources";

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
