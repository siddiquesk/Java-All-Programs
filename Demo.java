class A
{
int x,y,z;
   void add()
   {
    x=10;
	y=20;
	z=x+y;
	System.out.println(z);
   }

}
class B extends A
{
  void sub()
  {
  x=90;
  y=70;
  z=x-y;
	System.out.println(z);
  }

}
class C extends B
{
  void mul()
  {
  x=10;
  y=40;
  z=x*y;
	System.out.println(z);
  }
}
class D extends C
{
 void div()
  {
  x=2;
  y=57;
  z=x/y;
	System.out.println(z);
  }

}
class Demo 
{
	public static void main(String args[])
	{
		D s1=new D();
    s1.add();
	s1.sub();
	s1.mul();
	s1.div();
		
	}
  

}