package Practice;

public class FibonacciDirectRecursionWhile {
    public static int fibonacciA(int n) {
        System.out.println("A:" + n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciB(n - 1) + fibonacciA(n - 2);
        }
    }

    public static int fibonacciB(int n) {
        System.out.println("B:" + n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciA(n - 1) + fibonacciB(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        fibonacciA(n);
    }
}
