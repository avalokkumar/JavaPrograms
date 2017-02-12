package com.hackerrank;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String finalStr = new String();
        
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(Integer.valueOf(x).toString().length() == 1){
            	finalStr += String.format("%-15s00%d\n", s1, x);	
            }
            if(Integer.valueOf(x).toString().length() == 2){
            	finalStr += String.format("%-15s0%d\n", s1, x);	
            }
            if(Integer.valueOf(x).toString().length() == 3){
            	finalStr += String.format("%-15s%d\n", s1, x);	
            }
        }
        System.out.println("================================");
        System.out.print(finalStr);
        System.out.print("================================");
	}
}
