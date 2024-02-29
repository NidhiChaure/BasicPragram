package com.practice;

public class SumArray {

	public static void main(String[] args) {
		int arr[]= {3,4,3,2};

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
