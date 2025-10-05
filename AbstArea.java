import java.util.Scanner;
abstract class Shape
{
int a,b;
abstract void printArea();
}

class Rectangle extends Shape
{
Rectangle(int x,int y)
{
a = x;
b = y;
}
void printArea()
{
System.out.println("Area of Rectangle: "+a*b);
}
}

class Triangle extends Shape
{
Triangle(int x,int y)
{
a = x;
b = y;
}
void printArea()
{
System.out.println("Area of Triangle: "+(0.5*a*b));
}
}

class Circle extends Shape
{
Circle(int r)
{
a = r;
}
void printArea()
{
System.out.println("Area of Cirle: "+ 3.14*a*a);
}
}

class AbstArea
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter length and breadth of rectangle: ");
int l = sc.nextInt();
int b = sc.nextInt();
Rectangle o = new Rectangle(l,b);
o.printArea();

System.out.println("Enter base and height of triangle: ");
int bs = sc.nextInt();
int h = sc.nextInt();
Triangle t = new Triangle(bs,h);
t.printArea();

System.out.println("Enter Radius of circle: ");
int a = sc.nextInt();
Circle c = new Circle(a);
c.printArea();

}
}