import java.util.Scanner;
class Remainder
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int f = sc.nextInt();
int s = sc.nextInt();
int r = f%s;
System.out.println("Remainder is: "+r);
}
}
