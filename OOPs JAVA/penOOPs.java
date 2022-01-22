class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write Something...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() { // Non - parametrise constructors.....
    // System.out.println("Student Constructor");
    // }

    Student(String name, int age) { // Parametrise constructors.....
        this.name = name;
        this.age = age;
    }

}

public class penOOPs {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        // pen1.write();

        pen1.printColor();
        pen2.printColor();

        // Details for student....

        Student s1 = new Student("Aakanksha", 19);
        // s1.name = "Aakanksha";
        // s1.age = 19;
        s1.printInfo();
    }

}