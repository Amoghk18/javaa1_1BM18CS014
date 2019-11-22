class t1 implements Runnable
{
  Thread tt1;
  t1()
  {
    tt1=new Thread(this,"t1");
    tt1.start();
  }
  public void run()
  {
		while(true)
		{
			System.out.println("BMSCE");
			try{	
					Thread.sleep(10000);
				}
			catch(InterruptedException e){
				System.out.println("BMSCE caught");
			}
		}
  }
}
class t2 implements Runnable
{
  Thread tt2;
  t2()
  {
    tt2=new Thread(this,"t2");
    tt2.start();
  }
  public void run()
  {
		while(true)
		{
			System.out.println("CSE");
			try{	
					Thread.sleep(2000);
				}
			catch(InterruptedException e){
				System.out.println("CSE caught");
			}
		}
  }
}
class Threading{
	public static void main(String args[]){
		t1 tt1=new t1();
		t2 tt2=new t2();
	}
}
