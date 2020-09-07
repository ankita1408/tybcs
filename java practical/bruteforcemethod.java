package tybcs;

public class bruteforcemethod 
{

	public static void main(String[] args) 
	{ 
		int[] a= {11,23,33,44,11,23};
		System.out.print("dupalicate element are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j]) && (i!=0))
				{
					System.out.println(a[j]+" ");
				}
			}
		}
		
	}

}
