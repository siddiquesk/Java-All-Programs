class A
{
  int x;
  int y;
  A()
  {
	  System.out.println("welcome");
  }
  void f1()
  {
    x=50;
	y=90;
	System.out.println(x);
	System.out.println(y);
  }

}
class B extends A
{

  B()
  {
	  super();
	  System.out.println("kareem");
  }
void f2()
{
	
	System.out.println("hii");
}
}

class Inheritance
{
public static void main(String args[])
{
   B s1=new B();
   s1.f1();
   s1.f2();
   
}

}