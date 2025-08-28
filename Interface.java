interface a
{
public void disp();
}
class sample implements a
{
public void disp()
{
System.out.println("Disply executed");
}
}
class Interface
{
public static void main(String args[])
{
sample o = new sample();
o.disp();
}
}
