package com.others;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

	   Scanner scanner = new Scanner(System.in);
	   int i = 0;
	   while(scanner.hasNext()){
		   System.out.println(++i+" " +scanner.nextLine());
	   }
	   scanner.close();
	}
}