// Write a Java program to remove duplicate elements from an array and print the new array size

import java.util.Scanner;

public class assign_2 {
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
        int temp[] = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            int found = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                temp[size] = arr[i];
                size++;
            }
        }
        System.out.println("The new array is:");
        for (int j = 0; j < size; j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.println();
        System.out.println("The size of new array is: " + size);
        scan.close();
    }
}