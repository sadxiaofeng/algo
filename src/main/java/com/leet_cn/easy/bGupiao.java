package com.leet_cn.easy;

public class bGupiao {

    public static void main(String[] args) {

        int[] arr = {7, 1, 2, 1, 4, 1};


        int sum = maxProfit(arr);
        System.out.println(sum);

    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int sum = 0;

        int min = prices[0];
        int max = min;
        boolean flag = false;

        for (int i = 1; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
                flag = true;
            } else {
                if (flag) {
                    sum += max - min;
                    flag = false;
                }
                min = prices[i];
                max = prices[i];
            }
        }
        if (flag) {
            sum += max - min;
        }
        return sum;
    }
}
