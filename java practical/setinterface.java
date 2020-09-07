package tybcs;
import java.util.HashSet;
import java.util.Set;

public class setinterface 
{
	public static void main(String args[])
	{
        int[] a= {1,2,3,4,5,1,2,3,4,5,1,1,2,2,};
        
        System.out.print("duplicate elements are:");
         Set<Integer> s=new HashSet<>();
        for(int no:a)
        {
        	if(s.add(no)==false)
        	{
        		System.out.println(no+"");
        	}
        }
     }
}