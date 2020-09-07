package tybcs;

public class insertion 
{
	public static void main(String args[])
	{
		int[] a= {2,4,9,1,3,5};
		int temp,i,j;
		for(i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
				while(j>0 && a[j-1]>temp)
				{
					a[j]=a[j-1];
					j=j-1;
				}
				a[j]=temp;
		}
		for(i=1;i<a.length;i++)
		{
		System.out.println(a[i]+"");
		}
	}

}
