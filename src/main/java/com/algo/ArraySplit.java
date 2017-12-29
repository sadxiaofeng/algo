package com.algo;

/**
 * Created by qx44577 on 2017/12/25.
 */
public class ArraySplit {
    //    写一个函数分割一个整数数组，使得奇数在前偶数在后。
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int j = array.length - 1;
        for (; i < j; i++) {
            if (array[i] % 2 == 0) {
                for (; i < j; j--) {
                    if (array[j] % 2 != 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        j--;
                        break;
                    }
                }
            }
        }


        for (int x : array) {
            System.out.println(x);
        }
    }
}
