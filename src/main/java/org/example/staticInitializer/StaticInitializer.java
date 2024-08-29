package org.example.staticInitializer;

import java.util.Scanner;

public class StaticInitializer {
    static Scanner scanner = new Scanner(System.in);
    static int b;
    static int h;

    public static void main(String[] args) throws Exception{

        try {
            if (b > 0 && h > 0){
                int area = b * h;
                System.out.println(area);
            }else {
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
