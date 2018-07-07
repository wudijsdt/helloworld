package com.skyon;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        String str = "1,2,3";

        System.out.print(function(str));

    }
    public static String function(String str){
        String[] s = str.split(",");
        StringBuilder sb = new StringBuilder();
        Arrays.asList(s).forEach(s1 -> {
            Arrays.asList(WeekDayEnum.values()).forEach(e -> {
                if(Integer.parseInt(s1)==e.getValue())
                    sb.append(e.getDesc()).append(",");
            });
        });
        return sb.toString().substring(0,sb.toString().length()-1);
    }
}
// 0,1,2  String ==> Integer
// 0,1,2  Integer ==> String