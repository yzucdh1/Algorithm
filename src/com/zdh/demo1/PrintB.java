package com.zdh.demo1;

/**
 * 二进制位
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2022/12/6 9:20
 */
public class PrintB {

    public static void printB(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int num = 3;
//        printB(num);
        int a = -5;
        int b = ~a + 1;
//        printB(Integer.MAX_VALUE);
//        printB(Integer.MIN_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        printB(a);
//        printB((a >> 1)); // 带符号位右移
//        printB((a >>> 1)); // 不带符号位右移
        System.out.println(a);
        System.out.println(b);
        printB(a);
        printB(b);
    }
}
