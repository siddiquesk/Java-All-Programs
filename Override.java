class Exam //overriding kabhi bhi same class mai nhi hoga
{
	 int z;
	void f1()
	{
		System.out.println("hello");
	}
	void f1( int p)
	{
		 z=p;
		 System.out.println(z);
	}
	
}
class Nokiya extends Exam
{
	void f1()
	{
		
	}
}
class Override
{
 public static void main(String args[])
 {
   Nokiya n1=new Nokiya();
   n1.f1();
   n1.f1();
   n1.f1(100);
 }
}