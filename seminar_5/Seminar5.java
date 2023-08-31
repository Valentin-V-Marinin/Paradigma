package seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seminar5 {
    public static void main(String[] args) {

        // Задание №1
        // Напишите программу, которая находит все простые числа в заданном диапазоне.
        System.out.println("_____________  Задание №1  _______________________________________________");
        System.out.println(Seminar5.simpleNumbers(0, 107));
        System.out.println();

        // Задание №2
        //  Напишите программу, которая сортирует список чисел методом сортировки слиянием.
        System.out.println("_____________  Задание №2  _______________________________________________");
        int[] arr = {5, 2, 21, 14, 8, 9, 7, 1};
        System.out.println(Arrays.toString(arr));
        Seminar5.mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    public static List<Integer> simpleNumbers(int lowBorder, int highBorder) {
        ArrayList<Integer> result = new ArrayList<>();
        if (lowBorder <0) lowBorder = 0;
        for (int i = lowBorder; i <= highBorder; i++) {
            for (int j = 2; j <= i; j++) {
                if (j!=i){
                    if (i%j==0) break;
                } else {
                    result.add(i);
                }

            }
        }
        return result;
    }

    public static void mergeSort(int[] array, int arraySize) {
        if (arraySize < 2) {
            return;
        }
        int half = arraySize / 2;
        int[] left = new int[half];
        int[] right = new int[arraySize - half];

        for (int i = 0; i < half; i++) {
            left[i] = array[i];
        }
        for (int i = half; i < arraySize; i++) {
            right[i - half] = array[i];
        }
        Seminar5.mergeSort(left, half);
        Seminar5.mergeSort(right, arraySize - half);

        Seminar5.merge(array, left, right, half, arraySize - half);
    }

    public static void merge(
            int[] array, int[] leftArr, int[] rightArr, int left, int right) {

        int i = 0, j = 0, idx = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                array[idx++] = leftArr[i++];
            }
            else {
                array[idx++] = rightArr[j++];
            }
        }
        while (i < left) {
            array[idx++] = leftArr[i++];
        }
        while (j < right) {
            array[idx++] = rightArr[j++];
        }
    }

}
