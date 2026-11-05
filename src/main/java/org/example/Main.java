package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] result = multiplication.mul(n);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + result[i - 1]);
        }

        sc.close();
    }
}