package com.algo;

/**
 * Created by qx44577 on 2017/12/21.
 */
public class Alone {
//    算法题：落单的数
//
//    给出 2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，写一个函数找到这个数字。


    public static void main(String[] args) {
        int[] arr = {1, 9, 1 ,9 , 6};
        int alone = 0;
        for (int i = 0; i < arr.length; i++) {
            alone = alone ^ arr[i];
        }
        System.out.println(alone);

        System.out.println(0 ^ 10);
    }
}
