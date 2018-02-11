package com.leed.medium;

/**
 * Created by qx44577 on 2018/2/9.
 */
public class ReverseInteger {

//    Given a 32-bit signed integer, reverse digits of an integer.

    public static void main(String[] args) {
        int a = -64650;

        System.out.println(reverse(a));
        System.out.println(reverse_exp1(a));
    }

    public static int reverse(int o) {
        byte[] bytes = String.valueOf(Math.abs(o)).getBytes();
        StringBuffer buffer = new StringBuffer();
        for (int i = bytes.length - 1; i >= 0; i--) {
            if (i != bytes.length - 1 || bytes[i] != 48) {
                buffer.append(bytes[i] - 48);
            }
        }
        if (o < 0) {
            return 0 - Integer.parseInt(buffer.toString());
        } else {
            return Integer.parseInt(buffer.toString());
        }
    }

    public static int reverse_exp1(int x) {
        int result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}