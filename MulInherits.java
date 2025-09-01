interface a
{
public void sum(int x,int y);
}

interface b
{
public void sub(int x,int y);
}

class c implements a,b
{
public void sum(int x,int y)
{
System.out.println("Sum= "+(x+y));
}
public void sub(int x,int y)
{
System.out.println("Difference= "+(x-y));
}
}
class MulInherits
{
public static void main(String args[])
{
c o = new c();
o.sum(100,200);
o.sub(100,200);
}
}
