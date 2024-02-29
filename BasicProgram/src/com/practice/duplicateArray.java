package com.practice;

public class duplicateArray {

	public static void main(String[] args) {
		
int arr[]= {12,1,2,1,1,54};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.println("duplicate element is "+arr[i]);
		}
	}
}
	}

}
