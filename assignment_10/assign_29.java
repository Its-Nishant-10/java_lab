class ReentrantDemo {
    synchronized void method1() {
        System.out.println("Method1 start");
        method2();
        System.out.println("Method1 end");
    }

    synchronized void method2() {
        System.out.println("Method2 executing");
    }
}

class as_10_q_29 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        new ReentrantDemo().method1();
    }
}
