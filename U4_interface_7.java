
interface Drawable {
    void draw();

    default void msg() //it shows error if you remove default 
    {
        System.out.println("drawing...");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class U4_interface_7 {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.msg();
        d.draw();
    }
}