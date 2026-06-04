abstract class Car {

    public abstract void drive();  // abstract method - declare

    public void playMusic() {   // normal method
        System.out.println("music...");
    }

    public abstract void automatic(); // decalre
}

abstract class Toyato extends Car {  // abstract class

    public void drive() {   // implement
        System.out.println("driving...");  
    }
}

class Tesla extends Toyato {  // concrete class

    public void automatic() {   // implement
        System.out.println("automate...");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Car obj = new Tesla();
        obj.drive();
        obj.playMusic();
        obj.automatic();
    }
}
