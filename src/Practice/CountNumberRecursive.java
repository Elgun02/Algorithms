package Practice;

public class CountNumberRecursive {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println(sum);
//        System.out.println(sumOfDigits(12345));
//        System.out.println(sumOfDigits(number));

//        System.out.println(12345 % 10 + (1234 % 10) + (123 % 10) + (12 % 10) + (1 % 10));
//        System.out.println(12345 % 10);
//        System.out.println(1234 % 10);
//        System.out.println(123 % 10);
//        System.out.println(12 % 10);
//        System.out.println(1 % 10);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
