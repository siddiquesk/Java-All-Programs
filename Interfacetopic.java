interface Demo1
{
int x=80;
int y=80;
int h=222;
 void f1();
 

}
class Interfacetopic implements Demo1
{
 public  void f1()
  {
	 
	  System.out.println(x);
   System.out.println("hello pw");
  }
  void f2()
  {
	  System.out.println(h);
  }
public static void main(String args[])
{
   Interfacetopic d1=new Interfacetopic();
     d1.f1();
	 d1.f2();
 
}

}