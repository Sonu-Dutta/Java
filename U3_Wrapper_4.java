
// Java Wrapper classes wrap the primitive data types, that is why it is known as wrapper classes. We can also create a class which 
// wraps a primitive data type. So, we can create a custom wrapper class in Java.
//Creating the custom wrapper class 
class JavaTest{ 
private int i; 
JavaTest(){} 
JavaTest(int i){ 
this.i=i; 
} 
public int getValue(){ 
return i; 
} 
public void setValue(int i){ 
this.i=i; 
} 
@Override 
public String toString() { 
 return Integer.toString(i); 
} 
} 
//Testing the custom wrapper class 
public class U3_Wrapper_4{ 
public static void main(String[] args){ 
JavaTest j=new JavaTest(10); 
System.out.println(j); 
}}