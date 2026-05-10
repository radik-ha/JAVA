import java.util.Scanner;
class Fahrenheit
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter celcius:");
float c = sc.nextFloat();
float f = (c*9/5)+32;
System.out.println("Fahrenheit is: "+f);
}
}
