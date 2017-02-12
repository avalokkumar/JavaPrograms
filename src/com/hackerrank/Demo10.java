package com.hackerrank;

import java.util.Scanner;

public class Demo10 {

	static int B,H;
	static boolean flag=true;
	
	static{
		Scanner sc = new Scanner(System.in);
		try{
			B = sc.nextInt();
			H = sc.nextInt();
			if((B <= 0)|| (H <= 0)){
				throw new Exception();
			}
		}catch(Exception e){
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	    
	}
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
