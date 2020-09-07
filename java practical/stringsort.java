package tybcs;

public class stringsort 
{
	public static void main(String args[])
	{
		String[] a= {"palak","ankita","tanisha","sakshi"};
		String temp; int i;
		for( i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
