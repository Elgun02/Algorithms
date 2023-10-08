package Homework;

import java.util.Arrays;

public class Sort {
    public static int sort(int[] arr1, int[] arr2, int k) {
        int[] sortedArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, sortedArr, 0, arr1.length);

        System.arraycopy(arr2, 0, sortedArr, arr1.length, arr2.length);

        Arrays.sort(sortedArr);

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        return sortedArr[k];
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = sort(arr1, arr2, k);
        System.out.println("k = " + result);
    }
}
