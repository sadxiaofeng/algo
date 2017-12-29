package com.algo;

/**
 * Created by qx44577 on 2017/12/27.
 */
public class BigAdd {
    //    给定一个非负数，表示一个数字数组，在该数的基础上 +1，返回一个新的数组。写一个函数将该数字按照大小进行排列，最大的数在列表的最前面。
    public static void main(String[] args) {
        long number = 99999;
        byte[] arr = String.valueOf(number).getBytes();
        boolean flag = true;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (flag) {
                arr[i]++;
                if (arr[i] > '9') {
                    flag = true;
                    arr[i] = '0';
                } else {
                    flag = false;
                    break;
                }
            } else {
                break;
            }
        }

        int[] result = null;
        if (flag) {
            result = new int[arr.length + 1];
            result[0] = 1;
        } else {
            result = new int[arr.length];
        }
        for (int i = 0; i < arr.length; i++) {
            result[flag?i+1:i] = arr[i]-48;
        }

        for (int a : result) {
            System.out.print(a);
        }
    }
}
