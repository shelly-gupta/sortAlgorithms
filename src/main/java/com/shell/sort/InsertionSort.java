package com.shell.sort;

public class InsertionSort {

    public int[] sort(int[] array){
        int[] sortedPartition = new int[array.length];

        sortedPartition[0]=array[0];
        for (int i=1;i<array.length;i++){
            sortedPartition[i]=array[i];
            for(int j=i-1;j>=0;j--){
                if(array[i]<sortedPartition[j]){
                    sortedPartition[j+1] = sortedPartition[j];
                    sortedPartition[j] = array[i];
                }

            }
        }
        return sortedPartition;
    }
}
