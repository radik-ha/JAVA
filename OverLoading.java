class Arithmetic{

    int add(int a,int b)
    {
        System.out.println(a+b);
       return a+b;  
    }

    float add(float a,float b)
    {
        System.out.println(a+b);
        return a+b;   
    }

    int add(int a,int b,int c)
    {
        System.out.println(a+b+c);
        return a+b+c;
        
    }
}

class OverLoading{
    public static void main(String args[])
    {
        Arithmetic o = new Arithmetic();
        o.add(2,5);
        o.add(2.2f,5.0f);
        o.add(2,5,4);
    }
}