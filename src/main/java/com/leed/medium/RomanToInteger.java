package com.leed.medium;

/**
 * Created by qx44577 on 2018/2/12.
 */
public class RomanToInteger {

    public static String[][] map = {
            {"MMMCM", "MMM", "MM", "M"},
            {"CM", "DCCC", "DCC", "DC", "D", "CD", "CCC", "CC", "C"},
            {"XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "X"},
            {"IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"}
    };

    public static void main(String[] args) {
        String roman = "XXVIII";
        System.out.println(romanToI(roman));
        System.out.println(romanToInt(roman));
    }

    public static int romanToI(String roman) {
        int x = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (i == 0 ? 4 : 9); j++) {
                if (roman.startsWith(map[i][j])) {
                    x = x * 10 + (i == 0 ? 4 - j : 9 - j);
                    roman = roman.substring(map[i][j].length());
                }
            }
        }
        return x;
    }

    public static int romanToInt(String s) {
        int sum=0;
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}

        char c[]=s.toCharArray();
        int count=0;

        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;

        }

        return sum;

    }
}
