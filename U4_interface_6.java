
interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class TestInterface implements Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Everyone");
    }
}

public class U4_interface_6 {
    public static void main(String args[]) {
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();
    }
}