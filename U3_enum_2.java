class U3_enum_2 {
    // defining enum within class
    public enum Season {
        WINTER, SPRING, SUMMER, RAINY
        // WINTER, SPRING, SUMMER, RAINY;
    }

    // creating the main method
    public static void main(String[] args) {
        // printing all enum
        for (Season s : Season.values()) {
            System.out.println(s);
        }
        System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
    }
}