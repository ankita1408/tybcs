package tybcs;

public class recfibo 
{
	static int a=0,b=1,c;
	public static void main(String args[])
	{
		System.out.print(a+" "+b);
		recfibo ob=new recfibo();
	    ob.printFibo(10);	
	}
	 void printFibo(int i)
	 {
	if(i>=1)
	 {
		 c=a+b;
		 System.out.println(" "+c);
		 a=b;
		 b=c;
	     printFibo(i-1);
	 }
	 }
}
