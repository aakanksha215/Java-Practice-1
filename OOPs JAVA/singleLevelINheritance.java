//import bank;

class Shape {
    public void area() {
        System.out.println("Print area");
    }
}

class Triangle extends Shape { // Sinngle level Inheritance...
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class EquiTriangle extends Triangle { // Multi level Inheritance...

}

class Circle extends Shape { // Hierarchical level Inheritance
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class singleLevelINheritance {
    public static void main(String[] args) {
        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";

    }

}
