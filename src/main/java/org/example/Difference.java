package org.example;


// Написать функцию, возвращающую разницу между самым большим
// и самым маленьким элементами переданного не пустого массива.


public class Difference {
    public static int difference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    }



