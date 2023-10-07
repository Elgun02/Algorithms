package Practice;

public class FibonacciDirectRecursion {
    public static int fibonacciDirectRecursion(int n) {
        System.out.println(n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciDirectRecursion(n - 1) + fibonacciDirectRecursion(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + ") using direct recursion: " + fibonacciDirectRecursion(n));
    }
}
