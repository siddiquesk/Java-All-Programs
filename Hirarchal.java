class A
{
	int x;
  void show()
  {
	  x=10;
	   System.out.println(x);
      System.out.println("hello");
  }

}
class B extends A
{
void ok()
  {
	  x=100;
	    System.out.println(x);
  System.out.println("welcome");
  }

}
class C extends A
{
void sk()
  {
  System.out.println("byyy");
  }
}
class Hirarchal
{
public static void main(String args[])
{
  C s1=new C();
  B s2=new B();
  s1.show();
  s2.ok();
  s1.sk();
}
}