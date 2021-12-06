// Defined outside class

// enum Season {
//     WINTER, SPRING, SUMMER, FALL
// }

// class U3_enum_5 {
//     public static void main(String[] args) {
//         Season s = Season.WINTER;
//         System.out.println(s);
//     }
// }

//Defined Inside class

// class U3_enum_5 {
//     enum Season {
//         WINTER, SPRING, SUMMER, FALL;
//     }// semicolon(;) is optional here

//     public static void main(String[] args) {
//         Season s = Season.SUMMER;// enum type is required to access WINTER 
//         System.out.println(s);
//     }
// }

// main method inside Enum
// If you put main() method inside the enum, you can run the enum directly

enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s);
    }
}