import java.util.Arrays;

public class BinarySearch {
//    public static int search(int[] arr, int elm) {
//        int leftBorder = 0;
//        int rightBorder = arr.length - 1;
//
//        while(leftBorder <= rightBorder){
//            int middleIndex = (leftBorder + rightBorder) / 2;
//
//            if(elm == arr[middleIndex]) return middleIndex;
//            if(arr[middleIndex] < elm) {
//                leftBorder = middleIndex + 1;
//            } else {
//                rightBorder = middleIndex - 1;
//            }
//        }
//
//        return -1;


//    }


    public static class MaxElement {
        public static int search(int[] array) {
            int leftBorder = 0;
            int rightBorder = array.length - 1;

            while (leftBorder <= rightBorder) {
                int middleIndex = (leftBorder + rightBorder) / 2;

                if ((middleIndex == 0 || array[middleIndex] > array[middleIndex - 1]) && (middleIndex == array.length - 1 || array[middleIndex] > array[middleIndex + 1]))
                    return middleIndex;
                if (array[middleIndex] > array[middleIndex + 1]) {
                    rightBorder = middleIndex - 1;
                } else {
                    leftBorder = middleIndex + 1;
                }
            }
            return -1;
        }
    }



    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,55};
//        int elm = 9;
//
//        int result = BinarySearch.search(arr, elm);
//        System.out.println(result);
//        System.out.println(arr.length -1);
//        System.out.println(Arrays.toString(arr));
//        int a = arr[arr.length-1];
//        System.out.println(a);
//

//        int[] array = {0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
//
//        int max = array[0];
//
//        for (int i = 1; i < array.length - 1; i++) {
//            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
//                max = array[i];
//                break;
//            }
//        }
//
//        System.out.println("Максимальный элемент в массиве: " + max);

//        int[] arr = new int[1,2,3,4,5,10,9,8,7,6]
//
//        MaxElement.search([1,2,3,4,5,10,9,8,7,6])




    }
}