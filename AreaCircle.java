import java.util.Scanner;
class AreaCircle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Radius:");
float r = sc.nextFloat();
double a = 3.14*r*r;
System.out.println("Area of circle is: "+a);
}
}
