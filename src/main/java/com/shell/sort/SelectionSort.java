package com.shell.sort;

public class SelectionSort {

    public int[] sort(int[] array) {
        int arrLength = array.length;


        for (int i = 0; i < arrLength-1; i++) {
            int largest = array[0];
            int index=0;
            for (int j = 0; j < arrLength-i; j++) {
                if (array[j] > largest) {
                    largest = array[j];
                    index = j;
                }

            }
            int temp = array[arrLength-i-1];
            array[arrLength-i-1] = largest;
            array[index] = temp;

        }
        return array;
    }

}
