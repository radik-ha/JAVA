package maths;

public class Arith {
    public int add(int a, int b) {
        return a + b;
    }

    public int pow(int a) {
        return a * a;
    }

    public int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
