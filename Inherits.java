class Fruits{
void dispA()
{
System.out.println("Display Fruits");
}
}

class apple extends Fruits{
void dispB()
{
System.out.println("The color of apple is red");
}
}

class orange extends Fruits{
void dispC()
{
System.out.println("The color of orange is orange");
}
}

class Inherits{
public static void main(String args[])
{
orange o = new orange();
o.dispC();
o.dispA();

}
}