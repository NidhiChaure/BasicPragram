package com.practice;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1221;
int rem=0;
int temp=num;
int rev=0;
while(num>0)
{
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	}
		
	if(temp==rev)
	{
		System.out.println("this is a palindrome number"); 
		
	}
	else
	{
		System.out.println("this is not a palindrome number"); 
	}
	}

}
