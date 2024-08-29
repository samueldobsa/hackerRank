package org.example.currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paymant = scanner.nextDouble();
        scanner.close();

        Locale localIndia = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(localIndia);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(paymant));
        System.out.println("India: " + india.format(paymant));
        System.out.println("China: " + china.format(paymant));
        System.out.println("France: " + france.format(paymant));

    }
}
