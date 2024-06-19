 class Armstrong {

	public static void main(String args[])
	{
		for(int i=1;i<=500;i++)
		{
			int count=0,temp=i,power=0,sum=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
	      temp=i;
		while(temp>0)
		{
			int rem=temp%10;
			power=(int)Math.pow(rem,count);
			sum=sum+power;
			temp=temp/10;
					
		}if(i==sum)
	    	   System.out.println(i+" armstrong");
		
		}

         
		
    	   
	}

}
