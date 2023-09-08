package Homework;

public class MaxNumber {
    public static class Main {
        public static void main(String[] args) {
            // Инициализация массива
            int[] arr = {13, 42, 2, 25, 59, 75, 33, 9, 67};

            // Установка максимума
            int max = arr[0];

            // Цикл для перебора элементов массива
            for (int i = 1; i < arr.length; i++) {
                // Если текущий элемент больше максимума, обновляем максимум
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Вывод максимального значения
            System.out.println("Максимальное значение: " + max);
        }
    }
}
