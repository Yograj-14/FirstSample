package com;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int b=sc.nextInt();
//		a=a^b;
//		b=a^b;
//		a=a^b;
		a=a+b;
		b=a-b;
		a=a-b;
		int c=a;
		a=b;
		b=c;
		System.out.println("1st Number After Swaping"+a+ " 2nd Number After Swaping " +b);

	}

}
