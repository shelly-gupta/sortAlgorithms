package com.shell.sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] array){

        int arrLength = array.length;

        for(int i = 1; i<array.length - 1; i++){
            for(int j = 0;j < arrLength-i;j++){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                }

            }

        }
        return array;
    }

    private void swap(int array[], int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
