package com.leed.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qx44577 on 2017/12/29.
 */
public class TwoSum {
    //    1
    //    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //
    //    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //            Example:
    //    Given nums = [2, 7, 11, 15], target = 9,
    //
    //    Because nums[0] + nums[1] = 2 + 7 = 9,
    //            return [0, 1].
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
//        int[] b = twoSum(a,9);
        int[] b = twoSum_org(a, 9);
        for (int i : b) {
            System.out.println(i);
        }
    }

    public static int[] twoSum_org(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; map.put(numbers[i], i++))
            if (map.containsKey(target - numbers[i]))
                return new int[]{map.get(target - numbers[i]), i};
        return new int[]{0, 0};
    }
}
