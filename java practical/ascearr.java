package tybcs;

public class ascearr 
{
	public static void main(String args [])
	{
		int[] b=new int[] {1,2,3,4,5,6,7,8,9,22};
		int temp=0;
		System.out.println("element of orginal array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					temp=b[i];
					b[i]=b[j];
					b[i]=temp;
				}
			}
		}
		
	}

}
