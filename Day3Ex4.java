class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob");

        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
        System.out.println("Student 3 name: " + student3.getName());
    }
}
