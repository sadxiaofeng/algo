package com.algo;

import java.util.Date;

/**
 * Created by qx44577 on 2017/12/8.
 */
public class NumberCount {

    /*写一个函数计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0~9 的一个值。

    格式：

    输入行输入一个整数 n 和一个数字 k，最后输出数字 k 在 0 到 n 中出现的次数。*/

    static int n = 42512;
    static int k = 0;

    public static void main(String[] args) {
        int count = numberCount();
        System.out.println("count1=" + count);
        System.out.println("count2=" + qiong());
        System.out.println(Integer.MAX_VALUE);
    }

    public static int numberCount() {
        int c = 0;
        int length = String.valueOf(n).getBytes().length;
        long t1 = new Date().getTime();
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                c += n / 10 * 1 + (n % 10 >= k ? 1 : 0);
            } else {
                if (k == 0 && i != length-1) {
                    c += (n / (int) Math.pow(10, i + 1) - 1) * (int)Math.pow(10, i);
                }else{
                    c += n / (int) Math.pow(10, i + 1) * (int)Math.pow(10, i);
                }
                int idex = n / (int) Math.pow(10, i) % 10;
                if (idex > k && !(i == length - 1 && k == 0)) {
                    c += (int) Math.pow(10, i);
                }
                if (idex == k) {
                    c += n % (int) Math.pow(10, i) + 1;
                }
            }
        }
        long t2 = new Date().getTime();
        System.out.println("time1=" + (t2 - t1));
        return c;
    }

    public static int qiong() {
        int c = 0;
        long t1 = new Date().getTime();
        for (int i = 0; i <= n; i++) {
            for (int b : String.valueOf(i).getBytes()) {
                if (b - 48 == k)
                    c++;
            }
        }
        long t2 = new Date().getTime();
        System.out.println("time2=" + (t2 - t1));
        return c;
    }
}
