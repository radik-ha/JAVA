import java.util.Scanner;
class SqCu
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int a = sc.nextInt();
int sq = a*a;
int cu = a*a*a;
System.out.println("Square is: "+sq);
System.out.println("Cube is: "+cu);
}
}
