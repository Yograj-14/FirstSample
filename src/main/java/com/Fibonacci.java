package com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	int num1=0,num2=1;
	int num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number"+num1);
	num=sc.nextInt();
	for(int i=0;i<=num;i++) {
		System.out.println(num1+" ");
		int num3=num2+num1;
		num1=num2;
		num2=num3;
	}
	}

}
