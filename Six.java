class D
{
 private  String z="amit";
 private  static int x=30;
 
 void f2()
{
 System.out.println(z);
 System.out.println(x);
}
}
  class B
{
private static int x;
private  int y;
 void f1()
{
 x=900;
y=200;
 System.out.println(x);
System.out.println(y);
}

}
class Six{
public static void main(String args[])
{
  B s1=new B();
  D s2=new D();
    s1.f1();
    s2.f2();
}
}