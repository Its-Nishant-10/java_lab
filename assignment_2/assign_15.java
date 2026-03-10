/* Write a Java program to find the row with the maximum sum in a 2D matrix. */

import java.util.Scanner;

public class assign_15 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        for (int j = 0; j < c; j++) {
            maxSum += arr[0][j];
        }

        int rowIndex = 0;

        for (int i = 1; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("Row with maximum sum: " + rowIndex);
        System.out.println("Maximum sum: " + maxSum);

        sc.close();
    }
}