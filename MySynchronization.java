class Display
{	
	public synchronized void wish(String name)
	{
		
		for(int i=1;i<=10;i++)
		{
		System.out.print("Good Morning");
		try{Thread.sleep(1000);}
		catch(InterruptedException e){}
		System.out.println(name);
		}
	}
}
class MyThread extends Thread
{	
	Display d;
	String name;
	
	MyThread(Display d,String name)
	{
	this.d=d;
	this.name=name;
	}
	public void run()
	{
	d.wish(name);
	}
	
} 

class MySynchronization
{
	public static void main(String[] args)
	{
	Display d=new Display();
	MyThread t1=new MyThread(d,"Sangita");
	MyThread t2=new MyThread(d,"Suresh");
	t1.start();
	t2.start();
	}
}