abstract class a
{
abstract void disp();
}
class b extends a
{
void disp()
{
System.out.println("Display");
}
}
class Abstract
{
public static void main(String args[])
{
a o = new b();
o.disp();
}
}
