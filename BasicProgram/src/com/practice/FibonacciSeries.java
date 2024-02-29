package com.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int a=0,b=1,c=0;
		for(int i=2;i<num;i++)
		{
			System.out.println(" "+a);//0,1,1,2,3,5
			c=a+b;//1,2,3,5,8
			a=b;//1,1,2,3,5
			b=c;//1,2,3,5,8
		}
	}

}
