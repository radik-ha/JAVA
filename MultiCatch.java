class MultiCatch
{
public static void main(String args[])
{
int a=10,b=0,c[];
c = new int[5];
try
{
c[20] = a/b;
}
catch(ArithmeticException e)
{
e.printStackTrace();
System.out.println("Arithmetic Exception Handled");
}
catch(ArrayIndexOutOfBoundsException e)
{
e.printStackTrace();
System.out.println("Array index Handled");
}

catch(Exception e)
{
System.out.println("General Exception");
}
}
}