// User function Template for Java

class ReverseString {
    public static String reverseString(String s) {
        String rev = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            rev += s.charAt(i);
        }
       return rev;
    }
    public static void main(String args[])
    {
        String s = "for";
        System.out.println("Reverse a string is:"+ reverseString(s));
    }
}