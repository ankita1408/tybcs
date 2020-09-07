package tybcs;

public class secondlargest
{
	public static void main(String args[])
	{
		int[] a= {7,4,5,6,8,2,1,};int i;
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for( i=0;i<a.length;i++)
		{
			if (a[i]>largest)
			{
				second=largest;
				largest=a[i];
			}
			else if(a[i]>second && a[i]!=largest)
			{
				second=a[i];
			}
				
		}
		if (second==Integer.MIN_VALUE)
		{
		System.out.println("no second largest");
		}	
		else
		{
			System.out.println("second largest no. is"+second);	
		}
	}

}
