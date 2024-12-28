
class Amit
{
 int x=100,y=200;
int z;
void f1()
{
System.out.println("one");

}
void f2()
{
System.out.println("Two");

}
void f3()
{
System.out.println("Three");

}
void f4()
{
System.out.println("byyy");
}
}
class Four
{
public static void main(String args[])
{
Amit s1=new Amit();
Amit b1=new Amit();
b1.x=3000;
b1.z=700;
s1.f1();//one
s1.f2();//two
s1.f3();//three
s1.f4();//byy
System.out.println(s1.x);//100
System.out.println(s1.y);//200
System.out.println(s1.z);//0
System.out.println(b1.x);//3000
System.out.println(b1.z);//700
}

}