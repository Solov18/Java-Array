package org.example;


// Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0


public class CountEvens {
    public static int count_evens(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                count++;

            }

        }
        return count;
    }
}