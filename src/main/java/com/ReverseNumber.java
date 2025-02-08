package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		int b=0;
		int c=a;
		int d;
		while(a>0) {
			d=a%10;
			b=(b*10)+d;
			a=a/10;

		}
		System.out.println("revered number"+b);

	}

}
