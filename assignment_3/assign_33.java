/*
 * Write a Java program that accepts student name, roll number, and marks using
 * command line arguments and prints the student result
 */
class Student33 {
    String name;
    int roll;
    int marks;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");

        if (args.length < 3) {
            return;
        }

        Student33 s = new Student33();
        s.name = args[0];
        s.roll = Integer.parseInt(args[1]);
        s.marks = Integer.parseInt(args[2]);

        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
        System.out.println("Marks: " + s.marks);

        if (s.marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}