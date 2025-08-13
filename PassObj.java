//Passing object as parameter
class sample{
int z;
sample()
{
z = 0;
}

sample(int w)
{
z = w;
}

void disp()
{
System.out.println("z= " +z);
}
void pobj(sample b)
{
this.z = b.z;
}
}
class PassObj{
public static void main(String args[])
{
sample o = new sample(10); //Parameterized Constructor
sample x = new sample();  //Simple Constructor
o.disp();   
x.disp();
x.pobj(o); //Passing object 
x.disp();
}
}