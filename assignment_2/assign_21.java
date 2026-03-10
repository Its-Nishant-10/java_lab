
/*
 * Create a class Stud with data members (name, roll, marks of 3 subjects).
 * Write methods to input details, calculate percentage, and display all details
 */

import java.util.Scanner;

class Stud21 {
    String name;
    int roll;
    int marks1, marks2, marks3;

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        Stud21 s = new Stud21();
        s.inputDetails(sc);
        s.displayDetails();

        sc.close();
    }

    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter marks of 3 subjects (out of 50): ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
    }

    double calculatePercentage() {
        return (((marks1 + marks2 + marks3) / 150.0) * 100);
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks1 + " " + marks2 + " " + marks3);
        System.out.println("Percentage: " + calculatePercentage());
    }
}
