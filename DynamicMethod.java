class a
{
void disp()
{
System.out.println("Class A Display");
}
}
class b extends a 
{
void disp()
{
System.out.println("Class B Display");
}
}
class c extends a
{
void disp()
{
System.out.println("Class C Display");
}
}

class DynamicMethod
{
public static void main(String args[])
{
a x;
x = new b();
x.disp();
x = new c();
x.disp();
}
}