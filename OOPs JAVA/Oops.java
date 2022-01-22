
abstract class Animals {
    abstract public void walk();

    Animals() {
        System.out.println("you are creating an animal");
    }

    public void eats() {
        System.out.println("Animals eats");
    }
}

interface Animal {
    public void walk();
}

class Cats implements Animal {
    public void walk() {
        System.out.println("Cats Walks on 4 legs");
    }

}

class Horse extends Animals {
    Horse() {
        System.out.println("You are creating a horse");
    }

    public void walk() {
        System.out.println("walks on four legs");

    }
}

class Hen extends Animals {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class Oops {
    public static void main(String args[]) {
        Horse horse1 = new Horse();
        horse1.walk();
        Cats cat1 = new Cats();
        cat1.walk();

    }

}
