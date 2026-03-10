// Write a Java program to rotate an array by K positions to the right (user inputs K)

import java.util.Scanner;

public class assign_3 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the position to be rotated from:");
        int k = scan.nextInt();
        int rotate[] = new int[n];
        int val = 0;
        for (int i = n - k; i < n; i++) {
            rotate[val] = arr[i];
            val++;
        }
        for (int i = 0; i < n - k; i++) {
            rotate[val] = arr[i];
            val++;
        }
        System.out.println("The new array after rotating " + k + " position is:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotate[i] + " ");
        }
        scan.close();
    }
}