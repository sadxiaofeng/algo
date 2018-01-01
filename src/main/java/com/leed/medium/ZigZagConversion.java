package com.leed.medium;

/**
 * Created by 钱逊 on 2017/12/31.
 */
public class ZigZagConversion {
//    6
//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//    Write the code that will take a string and make this conversion given a number of rows:
//
//    string convert(string text, int nRows);

    public static void main(String[] args) {

        String str = "PAYPALISHIRING";
        int row = 3;
        System.out.println(convert(str, row));
        System.out.println(convert(str, row).equals("PAHNAPLSIIGYIR"));
    }

    public static String convert(String str, int row) {
        int index = -1;
        StringBuffer buff = new StringBuffer();
        int span = 2 * row - 2;

        int number = 0;
        for (int i = 0; i < row; i++) {
            int first = 0 + i;
            int end = 2 * row - 2 - i;

            if (i == 0) {
                index = 0;
                buff.append(str.charAt(index));

                while (true) {
                    index = number * span + end;
                    if (index >= str.length()) {
                        break;
                    } else {
                        buff.append(str.charAt(index));
                    }
                    number++;
                }
                number = 0;
            }

            if (first == end) {
                while (true) {
                    index = number * span + first;
                    if (index >= str.length()) {
                        break;
                    } else {
                        buff.append(str.charAt(index));
                    }
                    number++;
                }
                number = 0;
            } else if (i != 0) {
                while (true) {
                    index = number * span + first;
                    if (index >= str.length()) {
                        break;
                    } else {
                        buff.append(str.charAt(index));
                    }
                    index = number * span + end;
                    if (index >= str.length()) {
                        break;
                    } else {
                        buff.append(str.charAt(index));
                    }
                    number++;
                }
                number = 0;
            }
        }

        return buff.toString();
    }
}
