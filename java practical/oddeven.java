package tybcs;
import java.util.*;
public class oddeven 
{
	public static void main(String args[])
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("enetr no. of elements u want in array");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for ( int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("odd numbers:");
		for(int i=0; i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("even no.:");
		for(int i=0; i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
