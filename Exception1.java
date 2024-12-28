/*
                    Throwable is parent class 
	   1)exception                           2)error  two child class 
        .RuntimeException                    .StackoverFloawError
		.IoException                         .OutOfMemoryError
		.SqlException                         .IoError
		.InterreptedException                 .LinkageError
		.ClassNotFoundException
		
		
		1)RuntimeException
		-->ArithmeticException
		-->NullPointerException
		-->NumberFormatException
-->IndexOutOfBoundsException -->ArrayIndexOutOfBoundsException-->StringOutOfBoundException
		                       


   2)IoException
    -->EndOfFileException
	-->FileNotFoundException

*/
class Exception1
{
public static void main(String args[])
{
	/*
  int a=10;
 int  b=0;
 try{
	 
	 System.out.println(a/b); 
 }
  catch(ArithmeticException n1)
  {
	  System.out.println("hello");
  }
*/
//number foramt exception


String str="123";
try{
 int x=Integer.parseInt(str);
 System.out.println(x);
 System.out.println("number format exception");	
	
}
catch(NumberFormatException n1)
{
	System.out.println("string" +str+"is not converted int");
}


}


}