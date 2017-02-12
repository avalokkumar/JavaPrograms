package com.others;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        SimpleDateFormat sd = new SimpleDateFormat("EEEE");
        Calendar newCalendar = Calendar.getInstance();
        if(year > 2000 && year < 3000){
        	newCalendar.set(year, month-1, day, 0, 0);
        	Date d = newCalendar.getTime();
			System.out.println(sd.format(d).toString().toUpperCase());
        }
    }
}
