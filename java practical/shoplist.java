package tybcs;

import java.util.*;

public class shoplist
{

	public static void main(String args[])
	{
	
		
		Vector<String> ItemList= new Vector<String>();
		int i,len;
		len=args.length;
		
		for(i=0;i<len;i++)
		{
			ItemList.addElement(args[i]);
		}
		System.out.println("\nArgument Entered by you is as under:");
		for(i=0;i<len;i++)
		
			System.out.println("Argument"+(i+1)+"is"+args[i]);
		
	}

}
