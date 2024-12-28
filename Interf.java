interface Demo1
{
int x=80;
void f2();
 

}
class M implements Demo1{
	
	void f2()
	{
		System.out.println("hhhh");
	}
	void f3()
	{
		System.out.println(x);
	}
}
class Interf 
{

public static void main(String args[])
{
  M s1=new M();
   s1.f1();
 
}

}