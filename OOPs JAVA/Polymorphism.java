class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Polymorphism {
    public static void main(String args[]) {
        Shape sh;
        sh = new Rectangle();
        sh.draw();
        sh = new Circle();
        sh.draw();
        sh = new Triangle();
        sh.draw();
    }
}