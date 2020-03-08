package com.leet_cn.easy;

import java.util.Arrays;

/**
 *
 */
public class aRemove {

    public static void main(String[] args) {


        int[] arr = {1, 2, 2, 4, 5, 6, 6};

        int l = removeDuplicates(arr);
        System.out.println(l);
        System.out.println(Arrays.toString(arr));
    }


    public static int removeDuplicates(int[] num) {
        int l = 1;
        for (int i = l; i < num.length; i++) {
            boolean flag = true;
            for (int j = 0; j < l; j++) {
                if (num[i] == num[j]) {
                    flag = false;
                }
            }
            if (flag) {
                int tmp = num[l];
                num[l] = num[i];
                num[i] = tmp;
                l++;
            }
        }
        return l;
    }
}
