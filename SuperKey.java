class a
{
a(int m,int n)
{
System.out.println("m = " +m + "n = " +n);
}
int w = 10;
void dispa()
{
System.out.println("A class is display");
}
}

class b extends a
{
b()
{
super(10,20);
}
void dispb()
{
super.dispa();
System.out.println("B class display");
System.out.println("w = " +w);
}
}
class SuperKey
{
public static void main(String args[])
{
b o = new b();
o.dispb();
}
}
