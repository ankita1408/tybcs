package tybcs;

public class second_larg_no 
{
	public static void main(String args[])
	{
		int[] a= {21,32,44,77,12,11,9,6};
		int temp; int i;
		
		 
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				
		
	}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println("second largest element is"+a[i-2]);
}

}
