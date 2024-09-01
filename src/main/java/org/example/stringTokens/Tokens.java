package org.example.stringTokens;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = s.replaceAll("^[^A-Za-z]+|[^A-Za-z]", " ").trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] words = s.split(" +");
        System.out.println(words.length);
        for(String word : words){
            System.out.println(word);
        }

    }
}
