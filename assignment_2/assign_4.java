// Write a Java program to merge two sorted arrays into a new sorted array (without using built-in sort).

import java.util.Scanner;

public class assign_4 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        sc.close();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int newarr[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                k++;
                i++;
            } else {
                newarr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            newarr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < m) {
            newarr[k] = arr2[j];
            k++;
            j++;
        }
        System.out.println("The Merged Array is:");
        for (i = 0; i < k; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}