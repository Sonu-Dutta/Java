abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class U3_abstract_4 {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        // System.out.println(b.getRateOfInterest());  //This will print 8 , as recently object(b) is initiated to PNB
    }
}
