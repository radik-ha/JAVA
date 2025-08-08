class area{
    int l,b,a;
    area(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void disp(){
        a = l*b;
        System.out.println("Area = "+ a);
    }
}

class Sample{
    public static void main(String args[])
    {
        area x = new area(10,20);
        area y;
        x.disp();
        y = x;
        System.out.println("Length = " + y.l + " Breadth = " + y.b + " Area = " + y.a);

    }
} 