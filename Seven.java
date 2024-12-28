
//how we can access private static member variable without object creation
class B
{
private static int x;
private static String z;
private static int k=100;
 static  void f1()
{
  x=100;
   z="amit";
   if(k>0)
{
System.out.println("number is big");
}
else if(k<0){
System.out.println("number is not found ");
}
 System.out.println(x);
 System.out.println(z);
 
}

}
class Seven{
public static void main(String args[])
{
  B.f1();
}
}