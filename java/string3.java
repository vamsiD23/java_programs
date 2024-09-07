package com.basciprograms.strings;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello all good moring ";
		String arr[]=s1.split(" ");
		String copy=s1;
		System.out.println(copy);
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<arr.length;i++)
		{  
			if(i%2==0)
			{
				StringBuffer sb= new StringBuffer(arr[i]);
				sb.reverse();
			   result.append( sb.toString());
				
			}
			else 
			{
				result.append(arr[i].toUpperCase());
			}
			if(i<arr.length-1)
			{
				result.append(" ");
			}
			
		}
		
		System.out.println(result);	
	}

}
