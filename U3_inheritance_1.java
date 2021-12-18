class Animal{ 
    void eat(){System.out.println("eating...");} 
    } 
    class Dog extends Animal{ 
    void bark(){System.out.println("barking...");} 
    } 
    class Pup extends Dog{ 
    void weep(){System.out.println("weeping...");} 
    } 
    class U3_inheritance_1{ 
    public static void main(String args[]){ 
    Pup d=new Pup(); 
    d.weep(); 
    d.bark(); 
    d.eat(); 
    }}