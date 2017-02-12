package com.hackerrank;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		System.out.println(A.length()+B.length());
		if(A.toLowerCase().compareTo(B.toLowerCase()) > 1){
			System.out.println("Yes");
		}else if(A.toLowerCase().compareTo(B.toLowerCase()) < 1){
			System.out.println("No");
		}
		System.out.println(Character.toUpperCase(A.charAt(0))+""+ A.substring(1)+" "+
		Character.toUpperCase(B.charAt(0))+""+ B.substring(1));
	}	
}
