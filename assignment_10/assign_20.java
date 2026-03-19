class Demo20 {
    static synchronized void classLock() {
        System.out.println("Class lock");
    }

    synchronized void objLock() {
        System.out.println("Object lock");
    }
}

class as_10_q_20 {
    public static void main(String[] args) {
        System.out.println("Nishant - 241551078");
        Demo20 obj = new Demo20();
        obj.objLock();
        Demo20.classLock();
    }
}
