package tybcs;

public class pattern3 
{

	public static void main (String args[])
	{int i;int j;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
