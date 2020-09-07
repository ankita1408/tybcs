package tybcs;

public class selection 
{
	public static void main(String args[])
	{
		int[] a= {12,33,28,43,5,76};
		 int i;
		 
		int temp;
		for( i=0;i<a.length;i++)
		{int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
