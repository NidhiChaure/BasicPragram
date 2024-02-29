package com.practice;

public class minand_maxArray {

	public static void main(String[] args) {
		int a[]= {23,100,2,45};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("maximum value is"+max);
		
		System.out.println("min value is"+min);
	}

}
