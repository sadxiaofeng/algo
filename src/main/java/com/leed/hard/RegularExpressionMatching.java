package com.leed.hard;

/**
 * Created by qx44577 on 2018/2/9.
 */
public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "aa"));
        System.out.println(isMatch("aaa", "aa"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("aa", ".*"));
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("aab", "c*a*b"));
    }

    public static boolean isMatch(String s, String p) {
        int is = 0;
        int ip = 0;
        while (ip < p.length()) {
            char pchar = p.charAt(ip);
            if (pchar == '*') {
                ip++;
                continue;
            }
            if (ip < p.length() - 1) {
                if (p.charAt(ip + 1) == '*' && pchar != '.') {
                    while (is < s.length() && s.charAt(is) == pchar) {
                        is++;
                    }
                } else if (p.charAt(ip + 1) == '*' && pchar == '.') {

                } else {
                    if (pchar == '.') {

                    } else if (p.charAt(ip) != s.charAt(is)) {
                        return false;
                    }
                    is++;
                }
                ip++;
                continue;
            } else {
                if (p.charAt(ip) != s.charAt(is) || is != s.length() - 1) {
                    return false;
                }
                ip++;
                continue;
            }
        }

        return true;
    }
}
