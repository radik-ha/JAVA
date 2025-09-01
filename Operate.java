import maths.Arith;

class Operate {
    public static void main(String args[]) {
        Arith o = new Arith();
        System.out.println("Addition of two number is: " + o.add(20,30));
        System.out.println("Power is: " + o.pow(3));
        System.out.println("Factorial is: " + o.fact(5));
    }
}
