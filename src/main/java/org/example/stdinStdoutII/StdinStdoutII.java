package org.example.stdinStdoutII;

import java.util.Scanner;

public class StdinStdoutII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        double a = scanner.nextDouble();
        scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println("String " + b);
        System.out.println("Double " + a);
        System.out.println("Int " + i);

    }
}
