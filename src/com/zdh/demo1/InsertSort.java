package com.zdh.demo1;

/**
 * 插入排序
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/6 16:15
 */
public class InsertSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
