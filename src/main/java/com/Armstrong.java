package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int a=0,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int d=sc.nextInt();
		c=d;
		while(d>0) {
			b=d%10;
			d=d/10;
			a=a+(b*b*b);
		}
		if(c==a) {
			System.out.println(a+" The Given number is Armstrong....!");
		}
		else {
			System.out.println(a+" The Given number is not Armstrong....!");
		}

	}

}
