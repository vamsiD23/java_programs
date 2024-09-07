package com.basciprograms.strings;

public class String11 {

	public static void main(String[] args) {
		String s="hello all good mohrning";
		StringBuffer sb= new StringBuffer(s);
		int x,y;
		for(x=0;x<sb.length();x++)
		{
			for(y=x+1;y<sb.length();y++)
			{
				if(sb.charAt(x)==sb.charAt(y))
				sb.replace(y, y+1, "0");
		    }
		}
		String s2=sb.toString();
		for( x=0;x<s2.length();x++)
		{
			if(s2.charAt(x)!='0')
				System.out.println(s2);
		}
		
		
		

	}

}
