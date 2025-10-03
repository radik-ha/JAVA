class sample
{
<T> void disp(T a)
{
System.out.println("The value is:" +a);
}
}
class GenericMethod
{
public static void main(String args[])
{
sample o = new sample();
o.disp(23);
o.disp(2.34);
o.disp("RATHIKA");
}
}