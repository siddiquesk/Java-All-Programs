class A  //multilevel inheritance
{
  int x;
  int y;
 
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


void f2()
{
	
	System.out.println("jhatka");
}
}
class C extends B
{


void f3()
{
	
	System.out.println("patlu");
}
}

class D extends C
{


void f4()
{
	
	System.out.println("motu");
}
}

class Multilevel
{
public static void main(String args[])
{
   D s1=new D();
   s1.f1();
   s1.f2();
   s1.f3();
   s1.f4();
   
}

}