package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i]  = new Random().nextInt(0, 10);

        }
        System.out.println((Arrays.toString(array)) +" "+ "Количество чётных элементов"+ " : " + CountEvens.count_evens(array));
        System.out.println(Difference.difference(array) + " : " + "разницу между самым большим и самым маленьким элементами " );
        System.out.println(ZeroValue.zero(array) + " : " + " Имеются ли два соседних элемента, с нулевым значением ");




        }
    }


