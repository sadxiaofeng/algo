package com.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qx44577 on 2017/12/29.
 */
public class Match {
    public static void main(String[] args) {
        String pattern = "c *a9?";
        String string = "c kjasdhfkja9hdfa9b";
//        String[] pats = pattern.trim().split("[?|*]");
//        for(String p : pats){
//            System.out.println(p);
//        }
        System.out.println(isMatch(string,pattern));
        System.out.println(isPartten(string,pattern));
    }

    public static boolean isMatch(String str,String pattern){
        boolean flag = true;
        boolean startFlag = false;

        List<String> l = new ArrayList<>();

        int index = 0;
        for(Byte b : pattern.trim().getBytes()){
            if(b=='?'){
                l.add(pattern.substring(index,pattern.indexOf('?')));
                l.add("?");
                index = pattern.indexOf('?')+1;
            }else if (b=='*'){
                l.add(pattern.substring(index,pattern.indexOf('*')));
                l.add("*");
                index = pattern.indexOf('*')+1;
            }
        }
        if(index<=pattern.length()-1){
            l.add(pattern.substring(index));
        }

        for(String part:l){
            if(part.equals("?")){
                if(!startFlag){
                    if(str.length()>0){
                        str = str.substring(1);
                    }else{
                        flag = false;
                        break;
                    }
                }
            }else if(part.equals("*")){
                startFlag = true;
            }else{
                if(startFlag){
                    if(str.indexOf(part)!=-1){
                        str = str.substring(str.indexOf(part)+part.length());
                    }else{
                        flag = false;
                        break;
                    }
                    startFlag = false;
                }else{
                    if(str.startsWith(part)){
                        str = str.substring(part.length());
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(!str.equals("")){
            return false;
        }
        return flag;
    }

    public static boolean isPartten(String str,String pattern){
        pattern = pattern.replaceAll("\\?","[\\\\s\\\\S]").replaceAll("\\*","[\\\\s\\\\S]*");
        boolean flag = true;
        Pattern pat = Pattern.compile(pattern);
        Matcher matcher = pat.matcher(str);
        return matcher.find();
    }
}
