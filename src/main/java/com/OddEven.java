package com;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();
//		if(a%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}

		String evenodd=(a%2==0)?"even":"odd";
		System.out.println(evenodd);
	}

}
