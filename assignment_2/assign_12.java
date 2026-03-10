/*
 * Write a Java program to input a 2D matrix and check whether it is a sparse
 * matrix.
 */

import java.util.Scanner;

public class assign_12 {
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

        int zero = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                }
            }
        }

        int total = r * c;

        if (zero > total / 2) {
            System.out.println("Sparse matrix");
        } else {
            System.out.println("Not a sparse matrix");
        }

        sc.close();
    }
}