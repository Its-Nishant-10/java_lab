/* Write a Java program to multiply two matrices (check dimension validity). */

import java.util.Scanner;

public class assign_14 {
    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of B: ");
        int c2 = sc.nextInt();

        boolean valid = (c1 == r2);

        if (!valid) {
            System.out.println("Matrix multiplication not possible");
        } else {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] mul = new int[r1][c2];

            System.out.println("Enter matrix A:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter matrix B:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c2; j++) {
                    int sum = 0;
                    for (int k = 0; k < c1; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    mul[i][j] = sum;
                }

            System.out.println("Product matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mul[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}