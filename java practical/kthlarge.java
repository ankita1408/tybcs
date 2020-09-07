package tybcs;

public class kthlarge 
{

	public static void main(String[] args)
	{
		int a[]={12,11,32,44,57,34,22};
		int i;
		int temp;
		int k=6;
       for(i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]<a[j])
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    		   }
    	   }
    	   if(i==k-1)
    	   {
    		   System.out.println(k+"largest element is"+a[i]);
    	   }
       }
       System.out.println("             ");
       for(i=0;i<a.length;i++)
       {
    	   System.out.println(" "+a[i]);
       }
	}

}
