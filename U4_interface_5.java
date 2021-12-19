
interface Printable {
    void print();
}

interface Showable {
    void print();
}

class TestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }
}

public class U4_interface_5 {
    public static void main(String args[]) {
        TestInterface obj = new TestInterface();
        obj.print();
    }
}