class a implements Runnable
{
public void run()
{
System.out.println("Thread id:"+Thread.currentThread().getId());
}
}

class ImplementsRunnable
{
public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
Thread o = new Thread(new a());
o.start();
}
}
}