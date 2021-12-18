class U3_string_2{ 
    public static void main(String args[]){ 
     String s1="Sachin"; 
     String s2="Sachin"; 
     String s3=new String("Sachin"); 
     String s4="Saurav"; 
     System.out.println(s1.equals(s2));//true 
     System.out.println(s1.equals(s3));//true 
     System.out.println(s1.equals(s4));//false

     String st1="Sachin"; 
     String st2="Sachin"; 
     String st3=new String("Sachin"); 
     System.out.println(st1==st2);//true (because both refer to same instance)
     System.out.println(st1==st3);//false(because s3 refers to instance created in nonpool) 
        
     
     } 
    }
