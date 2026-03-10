/* Show that super() must be the first statement in a constructor. */
class A_0 {
    A_0() {
        System.out.println("A");
    }
}

class assig_4 extends A_0 {
    assig_4() {
        super();
        System.out.println("B");
    }

    static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new assig_4();
    }
}
