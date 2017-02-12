package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = sc.nextInt();
		int j = 0;
		String []wordList = new String[len-2];
		for (int i = 0; i < s.length()-2; i++) {
			String name = s.substring(i, len+i);
			wordList[j++] = name;
		}
		Arrays.sort(wordList);
		System.out.println(wordList[0]);
		System.out.println(wordList[wordList.length-1]);
	}
}

//len - 10
//welcomejava
/*
 * for (int i = 0; i < s.length()-3; i++) {
			String name = s.substring(i, len+i);
			String nextName = s.substring(i+1,len+i+1);
			if(min == null && max == null){
				min = name;
				max = name;
			}
			
			if(name.compareTo(nextName) < 1){
				
				if(name.compareTo(min) < 1){
					min = name;
				}
				if(nextName.compareTo(max) > 1){
					max = nextName;
				}
			}
			else if(name.compareTo(nextName) > 1){
				if(nextName.compareTo(min) < 1){
					min = nextName;
				}
				if(name.compareTo(max) > 1){
					max = name;
				}
			}
		}
 */