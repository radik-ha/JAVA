class a extends Thread
{
public void run()
{
System.out.println("Thread id:"+Thread.currentThread().getId());
}
}

class ExtendThread
{
public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
a o = new a();
o.start();
}
}
}