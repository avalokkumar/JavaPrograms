package com.hackerrank;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0,x=1;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = a;
            x = b;
            for (int j = 0; j < n; j++) {
				sum+=x;
				System.out.print(sum+ " ");
				x*=2;
			}
        }
        in.close();
    }
}
