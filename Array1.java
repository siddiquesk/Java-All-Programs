
import java.util.Scanner;
class Array1 {
    public static void main(String[] args)
    {
       
	   System.out.println("Enter the array size");
	   Scanner p1=new Scanner(System.in);
	   int size=p1.nextInt();
	   int a[]=new int[size];
	    System.out.println("Enter the array element");
	   for(int i=0;i<size;i++)
	   {
		   a[i]=p1.nextInt();
	   }
	   
        for(int i=0;i<size;i++)
	   {
		   System.out.println(a[i]);
	   }
                               
    }
}