package com.algo;

import java.util.Arrays;

/**
 * Created by qx44577 on 2017/12/26.
 */
public class MinimalDifference {
//    若给定两个整数数组（第一个是数组 A,第二个是数组 B）,在数组 A 中取 A[ i ],数组 B 中取 B[ j ],A[ i ] 和 B[ j ] 两者的差越小越好( | A[ i ] - B[ j ] | ),写一个函数返回最小差。
//
//    挑战 ：
//    时间复杂度 O(n log n)
    public static void main(String[] args) {
        int[] A ={4,11};
        Arrays.copyOf(A,A.length);
        int[] B ={2,3,8,9};
        Arrays.sort(B);
        int min = Integer.MAX_VALUE;
        for(int a:A){
            int rMin = 0;
            int rMax = B.length-1;
            int index = (rMin+rMax)/2;
            if(a<B[rMin]){
                min = B[rMin] - a;
            }else if(a>B[rMax]){
                min = a - B[rMax];
            }else{
                while(true){
                    if(a<B[index]){
                        rMax = index;
                        index = (rMin+rMax)/2;
                        if(rMax-rMin==1){
                            break;
                        }
                    }else if(a>B[index]){
                        rMin = index;
                        index = (rMin+rMax)/2;
                        if(rMax-rMin==1){
                            break;
                        }
                    }else{
                        rMax = index;
                        rMin = index;
                        break;
                    }
                }
                min = Math.min(min,Math.abs(a-B[rMin]));
                min = Math.min(min,Math.abs(a-B[rMax]));
            }
        }

        System.out.println(min);
    }
}
