import java.util.*;
class Arraytopic
{

public static void main(String args[])
{
  Scanner s1=new Scanner(System.in);
     int a[]=new int [6];
   System.out.println("enter array numbers ");
   int i;
   for(i=0;i<a.length;i++)
   {
	   a[i]=s1.nextInt();
   }
   System.out.println("out put arrray");
    for(i=0;i<a.length;i++)
   {
	   System.out.println(a[i]);
   }
}

}