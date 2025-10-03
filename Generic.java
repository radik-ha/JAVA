import java.util.Scanner;
class sample <T>
{
T x;
sample(T x)
{
this.x = x;
}
T  disp()
{
return x;
}
}

class Generic
{
public static void main(String args[])
{
sample <Integer> o = new sample <Integer> (10);
System.out.println("Value of x in Integer:"+o.disp());
sample <Float> i = new sample <Float> (2.4f);
System.out.println("Value of x in Float:"+i.disp());
sample <String> s = new sample <String> ("Rathika");
System.out.println("Value of x in String:"+s.disp());


}
}