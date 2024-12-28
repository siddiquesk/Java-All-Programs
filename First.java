class First
{
  static void fun1()
{
	System.out.println("fun1");
}

  static void fun2()
{
	System.out.println("fun2");
}

public static void main(String args[])
{
	System.out.println("fun3");
	First.fun1();
	First.fun2();
}


}