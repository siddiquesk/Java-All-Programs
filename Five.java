class A
{
int x;
static int y;
 void setData()
{
  x=99;
  y=100;
System.out.println(this.x);
System.out.println(A.y);
}

}


class Five
{
public static void main(String args[])
{
 A s1=new A();
  s1.setData();
  

}

}