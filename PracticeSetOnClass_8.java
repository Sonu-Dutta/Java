// Q.1) Create a class Employee with the following properties and methods:
    // Salary (property) (int)
    // getSalary (method returning int)
    // name (property) (String)
    // getName (method returning String)
    // setName (method changing name)
// Q.2) Create a class cellphone with methods to print ---> ringing…, vibrating…, etc.
// Q.3) Create a class Square with a method to initialize its side, calculating area, perimeter etc.
// Q.4) Create a class Rectangle & problem 3.
// Q.5) Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
// Q.6) Repeat problem 4 for a circle.


        class Employee{
            int salary;
            String name;
        
            public int getSalary(){
                return salary;
            }
            public void setName(String n){
                name = n;
            }
            public String getName(){
                return name;
            }
            
        }
        
        class CellPhone{
            public void ring(){
                System.out.println("Ringing...");
            }
            public void vibrate(){
                System.out.println("Vibrating...");
            }
            public void callFriend(){
                System.out.println("Calling Mukul...");
            }
        
        }
        
        class Square{
            int side;
            public int area(){
                return side*side;
            }
            public int perimeter(){
                return 4*side;
            }
        }
        
        class Rectangle{
            float length;
            float width;
            public Float area(){
                return length*width;
            }
            public Float perimeter(){
                return 2*(length + width);
            }
        }

        class Tommy{
            public void hit(){
                System.out.println("Hitting the enemy");
            }
            public void run(){
                System.out.println("Running from the enemy");
            }
            public void fire(){
                System.out.println("Firing on the enemy");
            }

         
        class Circle1{
            
            float radius;
            public double area(){
                return Math.PI*radius*radius;
            }
            public double perimeter(){
                return 2*Math.PI*radius;
            }
        }    
        
    }
public class PracticeSetOnClass_8 {
        public static void main(String[] args) {            
                // Problem 1
                // Employee harry = new Employee();
                // harry.setName("CodeWithHarry");
                // harry.salary = 233;
                // System.out.println(harry.getSalary());
                // System.out.println(harry.getName());
        
                // Problem 2
                // CellPhone asus = new CellPhone();
                // asus.callFriend();
                // asus.vibrate();
                //asus.ring();
        
        
                // Problem 3
                // Square sq = new Square();
                // sq.side = 3;
                // System.out.println(sq.area());
                // System.out.println(sq.perimeter());

                 //Problem 4
                //  Rectangle r=new Rectangle();
                //  r.width = 4.3f;
                //  r.length=5.6f;
                //  System.out.println(r.area());
                //  System.out.println(r.perimeter());
        
                // // Problem 5
                // Tommy player1 = new Tommy();
                // player1.fire();
                // player1.run();
                // player1.hit();

                //Problem 6
                Circle1 cr = new Circle1();
                cr.radius=5.6f;
                System.out.println(cr.area());
                System.out.println(cr.perimeter());
               
     }
        
}
