package com.basciprograms.strings;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="[[]]";
		String s2="wolrd";
		
		for(int i=0;i<=(s1.length()-1)/2;i++)
		{
			System.out.print(s1.charAt(i));
			
		}
		for(int i=0;i<s2.length();i++)
		{
			System.out.print(s2.charAt(i));
			
		}
		for(int i=((s1.length()-1)/2)+1;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
			
		}		

	}

}
