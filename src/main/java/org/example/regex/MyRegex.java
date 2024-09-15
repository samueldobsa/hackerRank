package org.example.regex;


import java.util.Scanner;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String IP = scanner.next();
            System.out.printf(String.valueOf(IP.matches(new MyRegex().pattern)));
        }
    }
}

public class MyRegex {

    String pattern;

    public MyRegex(){
        pattern ="\\b(0{0,2}\\d|0{0,1}\\d{2}|[0-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\."
                + "(0{0,2}\\d|0{0,1}\\d{2}|[0-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\."
                + "(0{0,2}\\d|0{0,1}\\d{2}|[0-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\."
                + "(0{0,2}\\d|0{0,1}\\d{2}|[0-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
    }

}
