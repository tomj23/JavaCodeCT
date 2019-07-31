package pl.coderstrust.multiplication;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 12: ");
        int size = scanner.nextInt();

        printMultiplicationTable(size);
    }

    public  static void printMultiplicationTable(int size) {

        System.out.print("    ");
        for(int i = 1; i<=size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int j = 1; j <=size; j++) {
            System.out.printf("%4d", j);
            for(int k=1; k<=size; k++) {
                System.out.printf("%4d", j * k);
            }
            System.out.println();
        }

    }
}
