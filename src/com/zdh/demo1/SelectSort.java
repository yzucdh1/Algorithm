package com.zdh.demo1;

/**
 * 选择排序
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/9 9:16
 */
public class SelectSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 4, 5, 8, 7, 9, 5};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
