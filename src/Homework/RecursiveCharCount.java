package Homework;

public class RecursiveCharCount {

    public static int searchCharRecursively(String str, char item) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        if (str.charAt(0) == item) {
            return 1 + searchCharRecursively(str.substring(1), item);
        }
        return searchCharRecursively(str.substring(1), item);
    }

    public static int searchCharIteratively (String str, char item) {
        int sum = 0;
        if (str == null) {
            return 0;
        }
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == item) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int iteratively = searchCharIteratively("hello world", 'l');
        int recursion = searchCharRecursively("hello world", 'l');
        System.out.println("Количество вхождений этого символа в строку = " + iteratively);
        System.out.println("Количество вхождений этого символа в строку = " + recursion);

    }
}
