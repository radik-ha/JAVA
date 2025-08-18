class sample{
int x;
sample get(int w){
sample a = new sample();
a.x = w;
return a;
}
}
class ReturnObject{
public static void main(String args[])
{
sample b = new sample();
sample c = new sample();
c = b.get(20);
System.out.println("x = "+b.x);
}
}
