public class Factorial{
    public static void main(String args[]) {
        int n = 5;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result*i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
