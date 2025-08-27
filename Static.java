class outer
{
static class inner
{
void disp()
{
System.out.println("DISPLAY EXECUTED");
}
}
}

class Static 
{
public static void main(String args[])
{
outer.inner o = new outer.inner();
o.disp();
}
}