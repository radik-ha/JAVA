import java.util.Random;
class Number extends Thread
{
Random rand = new Random();
public void run()
{
while(true)
{
int num = rand.nextInt(100);
System.out.println("Generated Number:"+num);
if(num%2 == 0)
{
Square s = new Square(num);
s.start();
}
else
{
Cube c = new Cube(num);
c.start();
}
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
}
class Square extends Thread
{
int n;
Square(int value)
{
n = value;
}
public void run()
{
System.out.println("Square of"+n+"="+(n*n));
}
}
class Cube extends Thread
{
int n;
Cube(int value)
{
n = value;
}
public void run()
{
System.out.println("Cube of"+n+"="+n*n*n);
}
}
class ThreadExample
{
public static void main(String args[])
{
Number ng = new Number();
ng.start();
}
}



















