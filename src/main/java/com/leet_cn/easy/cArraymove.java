package com.leet_cn.easy;

import java.util.Arrays;

public class cArraymove {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        rotate(arr, 2);
    }

    public static void rotate(int[] nums, int k) {
//        if (k == 0) {
//            System.out.println(Arrays.toString(nums));
//        }
//        k = k % nums.length;

        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);


    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}
