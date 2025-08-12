class Arithmetic{

    void disp()
    {
        System.out.println("Hi Rathika");
       
    }

    void disp(float a,float b)
    {
        System.out.println(a+b);
        
    }

    void disp(int a,int b,int c)
    {
        System.out.println(a+b+c);
        
    }
}

class MethodOrLoading{
    public static void main(String args[])
    {
        Arithmetic o = new Arithmetic();
        o.disp();
        o.disp(2.2f,5.0f);
        o.disp(2,5,4);
    }
}