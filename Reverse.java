class Reverse{
    public static void main(String args[])
    {
        int rev=0;
        int num=1234;
        while(num!=0)
        {
            rev = rev*10+(num%10);
            num = num/10;
        }
        System.out.println("Reverse order is :"+rev);
    }
}