package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String st="madam";
		String rev="";
//		for(int i=0;i<st.length();i++)
//		{
//			rev=st.charAt(i)+rev;//h
//		
//		}
		System.out.println(rev);
		
		for (int i=st.length()-1; i>=0; i-- ){
			rev=rev+st.charAt(i);
		
			
		}
		if(st.equals(rev))
		{
			System.out.println("given string is a palindrome");
		}
		else
		{
			System.out.println("given string is not a palindrome");
		}

		//System.out.println(rev);
	}

}
