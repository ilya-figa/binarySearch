package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5,9,1,3,2,6,3,8,10};
        int key = 8;
        System.out.println("search = " + search(array, key));
        sort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("binarySearch = " + binarySearch(array,key,0,array.length));
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int key, int low, int high){
        int middle  = (low + high)/ 2;

        if (high < low){
            return -1;
        }
        if (array[middle] == key) return middle;
        else if (array[middle] > key) return binarySearch(array, key, low, middle - 1);
        else if (array[middle] < key) return binarySearch(array, key, middle + 1, high);
        return -1;
    }
}
