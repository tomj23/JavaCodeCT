package pl.coderstrust.christmas;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of a Christmas Tree: ");
        int size = input.nextInt();

        printChristmasTree(size);
    }

    public static void printChristmasTree(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 0; l < (size - 1); l++) {
            System.out.print(" ");
        }
        System.out.print("**");
    }
}