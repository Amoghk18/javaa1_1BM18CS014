class Q
{
	int m;
	boolean valueset=false;
	synchronized void get()
	{
		try{
			while(!valueset)
			wait();
		}
		catch(InterruptedException e){
			System.out.println("Interupted");
		}
		valueset=false;
		System.out.println("got: "+m);
		notify();
		
	}
  synchronized void put(int a)
	{
		try{
			while(valueset)
			wait();
		}
		catch(InterruptedException e){
			System.out.println("interrupted");
		}
		this.m=a;
		System.out.println("put: "+m);
    valueset=true;
		notify();
	}
}
class Consumer implements Runnable
{
  Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"consumer").start();
	}
	public void run()
	{
		while(true){
		q.get();
		}
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"producer").start();
	}
	public void run()
	{
		int x=0;
		while(true){
		q.put(x++);
		}
	}
}
class PC
{
	public static void main(String args[])
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}
