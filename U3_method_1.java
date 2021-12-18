class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

class U3_method_1 {
    public static void main(String args[]) {
        // SBI s=new SBI(); 
        // ICICI i=new ICICI(); 
        // AXIS a=new AXIS(); 
        // System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
        // System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); 
        // System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
    }
}
