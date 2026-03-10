// Write a Java program to count the frequency of each element in an array (using another array/map logic)

import java.util.Scanner;

public class assign_5 {
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
        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1;
                }
            }
            System.out.println("The frequency of " + arr[i] + " is " + count);
        }
        sc.close();
    }
}