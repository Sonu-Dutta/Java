
interface printable {
    void print();
}

class A implements printable {
    public void print() {
        System.out.println("Hello");
    }
}

public class U4_Interface_1 {
    public static void main(String args[]) {
        A obj = new A();
        obj.print();
    }
}