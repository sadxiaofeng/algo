package com.algo;

/**
 * Created by qx44577 on 2017/12/25.
 */
public class EndWithZero {
//    设计一个算法，计算出任意一个整数 n 的阶乘中尾部零的个数
//
//    挑战 :
//    O(logN)的时间复杂度

    public static void main(String[] args) {
        //总结：尾部为0 则为因式分解后5的个数
        int k = 84;
        int n = cal(k);
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += (int)(k/Math.pow(5,i));
        }
        sum = k/2>sum?sum:k/2;
        System.out.println("n="+n);
        System.out.println("sum="+sum);
    }

    public static int cal(int k){
        int i = 1;
        while(Math.pow(5,i)<k){
            i++;
        }
        return i-1;
    }
}
