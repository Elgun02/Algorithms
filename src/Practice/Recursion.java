package Practice;

public class Recursion {
    public static int func(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * func(n - 1);
        }
    }
    public static void main(String[] args) {
        int i = func(5);
        System.out.println(i);
    }
}
