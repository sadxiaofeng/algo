package com.leed.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by qx44577 on 2017/12/29.
 */
public class LongestSubStr {

//    Given a string, find the length of the longest substring without repeating characters.
//
//    Examples:
//
//    Given "abcabcbb", the answer is "abc", which the length is 3.
//
//    Given "bbbbb", the answer is "b", with the length of 1.
//
//    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a
//    subsequence and not a substring.


    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        String str = "aijzlkcnvzxn,znxvzjflgk";
        System.out.println(longestStr(str));
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static String longestStr(String str) {
        String result = "";
        String current = "";
        for (byte b : str.getBytes()) {
            int index = -1;
            if ((index = current.indexOf(b)) != -1) {
                if (current.length() > result.length()) {
                    result = current;
                }
                current = current.substring(index + 1);
            } else {
                current += (char) b;
            }
        }
        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
