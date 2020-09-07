package tybcs;

public class revarry 
{
	public static void main(String args[])
	{
		int[] a=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("Oringinal array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		System.out.println();
		System.out.println("Array in reverse order:");
		for(int i= a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"");
		}
	}

}
