class Exam
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
class Overload
{
 public static void main(String args[])
 {
   Exam n1=new Exam();
   n1.f1();
   n1.f1(55);
 }
}