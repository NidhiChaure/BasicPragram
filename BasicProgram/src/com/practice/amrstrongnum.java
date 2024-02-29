package com.practice;

import java.util.Scanner;

public class amrstrongnum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int temp=num;
	int d=0;
	while (num!=0) {
		 num=num/10;
		 d++;
		
	}
	System.out.println("the number of digits :"+d);
	num=temp;
	int sum=0;
	while (num!=0) {
		int n=num%10;
		sum+=Math.pow(n, d);
		num=num/10;
		
	}
	System.out.println("the sum of  digits :"+sum);

	
		
	
}
}
