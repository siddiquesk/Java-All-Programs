
 abstract class A
{
int x;
int y;
int w;
 int z;
  abstract void f1();
  A(int k)
  {
	  w=k;
	  System.out.println(w);
	  System.out.println("kareem");
  }

}
class B extends A
{
	B()
	{
		super(3000);
		System.out.println("mirza motu");
	}
  void f1()
 {

 System.out.println("hello");
 }
 void f2()
 {
	 	 x=1000;
	 y=90;
 System.out.println(x);
 System.out.println(y);
 }

}
class Abstractclass
{
	public static void main(String args[])
	{
		
		B n1=new B();
        n1.f1();
		n1.f2();

	}
  
}