class Cust {
    double amt;

    Cust(double amt) {
        this.amt = amt;
    }

    void get_discount() {
        System.out.println("No Discount");
        System.out.println("Bill " + amt);
    }
}

class RegularCustomer extends Cust {
    RegularCustomer(double amt) {
        super(amt);
    }

    void get_discount() {
        System.out.println("Discount is 5%");
        System.out.println("Bill " + (amt - amt * 0.05));
    }
}

class PremCustomer extends Cust {
    PremCustomer(double amt) {
        super(amt);
    }

    void get_discount() {
        System.out.println("Discount is 10%");
        System.out.println("Bill " + (amt - amt * 0.10));
    }
}

class VIPCustomer extends Cust {
    VIPCustomer(double amt) {
        super(amt);
    }

    void get_discount() {
        System.out.println("Discount is 20%");
        System.out.println("Bill " + (amt - amt * 0.20));
    }
}

class M {
    public static void main(String[] args) {
        Cust c1 = new Cust(100);
        Cust c2 = new RegularCustomer(100);
        Cust c3 = new PremCustomer(100);
        Cust c4 = new VIPCustomer(100);

        c1.get_discount();
        c2.get_discount();
        c3.get_discount();
        c4.get_discount();
    }
}
