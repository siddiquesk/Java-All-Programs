
class process1 implements Runnable //interface
{
	public void run()
	{
	  int i;
     for(i=1;i<=10;i++)
	 {
      System.out.println("process1: "+i);
	 }		 
	}
	
}
class process2 implements Runnable
{
	public void run()
	{
		  int i;
     for(i=10;i<=20;i++)
	 {
      System.out.println("process2: "+i);
	 }	
		
	}
	
}
class process3 implements Runnable
{
	public void run()
	{
	  int i;
     for(i=30;i<=40;i++)
	 {
      System.out.println("process3: "+i);
	 }		 
	}
	
}
class Multithread
{
public static void main(String args[])
{
 process1 p1=new process1();
 process2 p2=new process2();
 process3 p3=new process3();
 Thread t1=new Thread(p1);
 Thread t2=new Thread(p2);
 Thread t3=new Thread(p3);
 t1.start();
 t2.start();
 t3.start();
}

}