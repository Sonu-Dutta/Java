interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }
}
    public class U4_interface_4 {
        public static void main(String[] args) {
            A obj=new A();
            obj.print();
            obj.show();
        }
    }