package org.example.otpForm;

import java.util.Scanner;

public class OtpForm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            // Read the input string and integer
            String str = scanner.next();
            int number = scanner.nextInt();

            // Print the formatted output
            System.out.printf("%-15s%03d%n", str, number);
        }

        System.out.println("================================");
    }
}
