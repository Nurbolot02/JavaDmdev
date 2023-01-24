package org.example.test;

import java.util.Arrays;

public class TinkoffTask {
    public static void main(String[] args) {
        /*
        Дан массив целых чисел, отсортированный по возрастанию.
        Вернуть массив, содержащий элементы исходного массива в квадрате,
        также отсортированный по возрастанию.

        [1, 4, 10] → [1, 16, 100]

        [-5, -3, 0, 1, 2, 4] → [0, 1, 4, 9, 16, 25]

        [25, 6, 0, 1, 4, 8, 16]
         */

        int[] array = {1, 4, 10};
        int[] array2 = {-1, -4, -10};
        int[] arrayEven = {-5, -3, 0, 1, 2, 4};
        int[] arrayNotEven = {-5, -3, 0, 1, 2, 4, 7};

        array = mergeSort(array);
        array2 = mergeSort(array2);
        arrayEven = mergeSort(arrayEven);
        arrayNotEven = mergeSort(arrayNotEven);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(arrayEven));
        System.out.println(Arrays.toString(arrayNotEven));
    }


    public static int[] mergeSort(int[] array) {

        if (array[array.length - 1] < 0) {
            mergeSortMinus(array, array.length - 1);
            return array;
        } else if (array[0] >= 0) {
            mergeSortPlus(array, 0);
            return array;
        }

        int centerIntIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                centerIntIndex = i;
                break;
            }
        }
        mergeSortMinus(array, centerIntIndex);
        mergeSortPlus(array, centerIntIndex);

        int[] result = new int[array.length];
        int minusCurIndex = centerIntIndex - 1;

        int arrayLength = array.length % 2 == 0 ? array.length - 1 : array.length;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                int lastIndex = centerIntIndex <= arrayLength - 1 ? centerIntIndex : minusCurIndex;
                result[i] = array[lastIndex];
                break;
            }
            if (i < arrayLength && array[centerIntIndex] < array[minusCurIndex]) {
                result[i] = array[centerIntIndex];
                centerIntIndex++;
            } else {
                result[i] = array[minusCurIndex];
                minusCurIndex -= 1;
            }
        }

        return result;
    }

    private static void mergeSortPlus(int[] array, int centerIntIndex) {
        for (int i = centerIntIndex; i < array.length; i++) {
            array[i] *= array[i];
        }
    }

    private static void mergeSortMinus(int[] array, int centerIntIndex) {
        for (int i = 0; i < centerIntIndex; i++) {
            array[i] *= array[i];
        }
    }
}