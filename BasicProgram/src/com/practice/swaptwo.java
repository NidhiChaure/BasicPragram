package com.practice;

public class swaptwo {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=0;
	a=a+b;//30
	b=a-b;//10
	a=a-b;//20
	
	//without using third variable
	
	int p=10;
	int q=20;
	int temp;
	p=q;//10
	temp=q;//20
	a=temp;//20
	
	
	}

}
