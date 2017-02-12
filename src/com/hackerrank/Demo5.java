package com.hackerrank;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numArr[] = new long[5];
        numArr[0] = in.nextLong();
        numArr[1] = in.nextLong();
        numArr[2] = in.nextLong();
        numArr[3] = in.nextLong();
        numArr[4] = in.nextLong();
        long min = numArr[0],max = numArr[0] , sumMin=0,sumMax = 0;
        for (int i = 0; i < 5; i++) {
			if(numArr[i] > min){
				sumMax += numArr[i];
			}
			if(numArr[i] < max){
				sumMin += numArr[i];
			}
		}
        System.out.println(sumMin +" - "+sumMax);
    }
}
