class U3_string_8{ 
    public static void main(String args[]){ 
     String s1="Samir"; 
     String s2="Samir"; 
     String s3="Rita"; 
     System.out.println(s1.compareTo(s2));//0 
     System.out.println(s1.compareTo(s3));//1(because s1>s3) 
     System.out.println(s3.compareTo(s1));//-1(because s3 < s1 ) 
    } 
    } 