package com.leed.medium;

/**
 * Created by qx44577 on 2018/2/12.
 */
public class IntegerToRoman {

    public static String[] thou = {"","M","MM","MMM","MMMCM"};
    public static String[] horn = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public static String[] ten = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static String[] one = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

    public static void main(String[] args) {
        System.out.println(intToR(28));
    }

    public static String intToR(int i){
        return thou[i/1000]+horn[i%1000/100]+ten[i%100/10]+one[i%10];
    }
}
