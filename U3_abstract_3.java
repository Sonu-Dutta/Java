abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

// Creating a Child class which inherits Abstract class
class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }

    // If there is method with same name in the derived class then this will be executed

    // void changeGear() {
    //     System.out.println("gear will be changed");
    // }
}

// Creating a Test class which calls abstract and non-abstract methods
class U3_abstract_3 {
    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}