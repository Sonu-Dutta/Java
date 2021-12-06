// The abstract class can also be used to provide some implementation of the interface.
//  In such case, the end user may not be forced to override all the methods of the interface

// abstract class A {
//    abstract void a();

//    abstract void b();

//    abstract void c();

//    abstract void d();
// }

interface  A {
    void a();
    
    void b();
    
    void c();
    
    void d();
    }

// abstract class B extends A {
    abstract class B implements A{
    public void c() {
        System.out.println("I am c");
    }
    public void d() {
        System.out.println("I am d");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }
    public void d() {
        System.out.println("I am D");
    }
   
}

class U3_abstract_2 {
    public static void main(String args[]) {
        A obj = new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}
