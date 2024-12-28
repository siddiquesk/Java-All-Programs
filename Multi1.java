


class process1 extends Thread
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
class process2 extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("process2: "+i);
		}
	}
	
}
class process3 extends Thread
{
	public void run()
	{
		int i;
		for(i=10;i<=20;i++)
		{
			System.out.println("process3: "+i);
		}
	}
	
}
class process4 extends Thread
{
	public void run()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("proces4: hello");
		}
	}
	
}
class Multi1
{
public static void main(String args[])
{
 process1 s1=new process1();
 process2 s2=new process2();
 process3 s3=new process3();
 process4 s4=new process4();
  s1.start();
  s2.start();
  s3.start();
  s4.start();
}

}