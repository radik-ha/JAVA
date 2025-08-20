class A
{
void dispA(){
System.out.println("A is display");
}
}
class B extends A
{
void dispB(){
System.out.println("B is display");
}
}
class C extends A
{
void dispC(){
System.out.println("C is display");
}
}

class HInherits
{
public static void main(String args[])
{
C o = new C();
o.dispA();
o.dispC();
B x = new B();
x.dispA();
x.dispB();
}
}
