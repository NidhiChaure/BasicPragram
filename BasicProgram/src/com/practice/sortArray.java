package com.practice;

public class sortArray {

	public static void main(String[] args) {

		int arr[]= {12,7,2,1,13,54};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
			System.out.println("sort an array"+arr[i]);
			System.out.println();
			
		}
	}

}
