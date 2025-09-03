class Except
{
public static void main(String args[])
{
int a=10,b=0,c;
System.out.println("Welcome");
try
{
c = a/b;
}
catch(ArithmeticException e)
{
System.out.println("Exception caught");
e.printStackTrace();
}
System.out.println("Thank You!");
}
}