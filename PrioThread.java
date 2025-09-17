class sample extends Thread
{
static int i=1;
public void run()
{
System.out.println("ID:"+Thread.currentThread().getId()+"Name: "+Thread.currentThread().getName()); Thread.currentThread().setName("Einstein-" + i++);
System.out.println("ID:"+Thread.currentThread().getId()+"Name: "+Thread.currentThread().getName());
}
}

class PrioThread
{
public static void main(String args[])
{
sample x = new sample();
sample y = new sample();
sample z = new sample();
x.start();
y.start();
z.start();
System.out.println("Priority for x thread:"+x.getPriority());
System.out.println("Priority for y thread:"+y.getPriority());
System.out.println("Priority for z thread:"+z.getPriority());
x.setPriority(1);
y.setPriority(2);
z.setPriority(10);
System.out.println("Priority for x thread: "+ x.getPriority());
System.out.println("Priority for y thread: "+ y.getPriority());
System.out.println("Priority for z thread: "+ z.getPriority());
}
}