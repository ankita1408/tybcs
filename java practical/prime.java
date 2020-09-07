package tybcs;

public class prime 
{
	public static void main(String args[])
	{
		int no=73 ;
		int temp=0;
		int i;
		for( i=2;i>=no-1;i++);
		{
		     if(no%i==0)
		     {
		    	 temp=temp+1;
		     }
		if(temp>0)
		{
			System.out.println("not a prime");
		}
		else
		{
			System.out.println(" a prime");

		}
		}
	}

}
