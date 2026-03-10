/*
 * Write a Java program to find the maximum sum subarray using Kadane's
 * algorithm.
 */

import java.util.Scanner;

public class assign_11 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int curr = arr[0];

        for (int i = 1; i < n; i++) {
            if (curr + arr[i] > arr[i]) {
                curr = curr + arr[i];
            } else {
                curr = arr[i];
            }

            if (curr > maxSum) {
                maxSum = curr;
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
        sc.close();
    }
}
