class U3_enum_1{
    // defining the enum inside the class
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    // main method
    public static void main(String[] args) {
        // traversing the enum
        for (Season s : Season.values())
            System.out.println(s);
    }
}