// different ways to concate 2 strings
public class U3_string_6 
{ 
 public static void main(String args[]) 
 { 
  
//  String s1 = new String("Hello"); //String 1 
//  String s2 = new String(" World"); //String 2 
//  String s = String.join(" * ",s1,s2); //String 3 to store the result 
//  String s = String.format("%s%s",s1,s2); 
//  String s=s1.concat(s2);

StringBuilder s1 = new StringBuilder("Hello"); //String 1 
StringBuilder s2 = new StringBuilder(" World"); //String 2 
StringBuilder s = s1.append(s2); 

 System.out.println(s.toString()); //Displays result 
 } 
}



// public class StrBuilder 
// { /* Driver Code */ public static void main(String args[]) 
//  { 

//  System.out.println(s.toString()); //Displays result 
//  } 
// } 

