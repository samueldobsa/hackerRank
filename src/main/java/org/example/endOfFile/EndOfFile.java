package org.example.endOfFile;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext(); i++){
            String input = scanner.nextLine();

            System.out.println(i + " " + input);
        }
    }
}
