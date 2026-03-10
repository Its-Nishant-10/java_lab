/*
 * Write a Java program to check whether two arrays are equal (same elements in
 * same order).
 */

import java.util.Scanner;

public class assign_7 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        if (n == m) {
            int i = 0, j = 0;
            while (i < n && j < m) {
                if (arr1[i] != arr2[j]) {
                    System.out.println("Arrays are not equal");
                    return;
                }
                i++;
                j++;
            }
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}