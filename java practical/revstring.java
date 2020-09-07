package tybcs;

public class revstring 
{
		public static void main(String agrs[]) 
		{
			String name="ankita";
			int len=name.length();
			String rev=" ";
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+name.charAt(i);
			}
			System.out.println("revers string name is"+rev);

		}

}

