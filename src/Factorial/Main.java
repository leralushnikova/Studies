package Factorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        int a;
        if(n < 2) return 1;
        a = factorial(n-1)*n;
        return a;
    }
}
