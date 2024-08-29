package org.example.encoding;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class EncodingMD5 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] theMD5digest = messageDigest.digest(input.getBytes());

            BigInteger no = new BigInteger(1, theMD5digest);

            String hashText = no.toString(16);
            while (hashText.length() < 32){
                hashText = "0" + hashText;
            }
            System.out.println(hashText);
        }catch (Exception e){
            throw new Exception(e);
        }

    }
}
