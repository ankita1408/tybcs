package tybcs;

public class linearsearch 
{
	public static void main(String args[])
	{
		int[] a= {12,55,44,57,56};
		int item =56;
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("item is present at"+i+"index position");
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println("item not found");
		}
	}

}
