package org.example.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] a1 = a.toCharArray();

        for (char c : a1) {
            int index = b.indexOf(c);

            if (index != -1) {
                b = b.substring(0, index) + b.substring(index + 1, b.length());
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        scanner.close();

        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");

    }
}
