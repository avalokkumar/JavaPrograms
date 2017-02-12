package com.others;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: "+usFormat.format(payment));
        NumberFormat indFormat = NumberFormat.getCurrencyInstance(new Locale("en", "ind"));
        DecimalFormatSymbols df = new DecimalFormatSymbols();
        df.setCurrencySymbol("Rs.");
        df.setDecimalSeparator('.');
        df.setMonetaryDecimalSeparator('.');
        ((DecimalFormat)indFormat).setDecimalFormatSymbols(df);
        System.out.println("India: "+indFormat.format(payment));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: "+chinaFormat.format(payment));
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: "+frFormat.format(payment));
       
        scanner.close();
	}
}
