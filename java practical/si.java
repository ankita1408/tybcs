package tybcs;

public class si 
{
	 public static void main(String ar[])
	 {
		    float si;				
		    int p = Integer.parseInt(ar[0]);		
		    float r = Float.parseFloat(ar[1]);		
		    int t = Integer.parseInt(ar[2]);		
		    si =(p*r*t)/100;			
		    System.out.println("Simple Interest is "+si); 
	 }

}
