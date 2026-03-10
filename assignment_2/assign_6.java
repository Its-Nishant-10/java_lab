/*
 * Write a Java program to find all pairs of elements whose sum equals a target avoid duplicates
 */

import java.util.Scanner;

public class assign_6 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] visited = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = 0;
        }
        System.out.print("Enter the Target Value");
        int tar = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (visited[j] == 1) {
                    continue;
                }
                if (arr[i] + arr[j] == tar) {
                    System.out.println("The set is {" + arr[i] + ", " + arr[j] + "}");
                    visited[i] = 1;
                    visited[j] = 1;
                    break;
                }
            }
        }
        sc.close();
    }
}