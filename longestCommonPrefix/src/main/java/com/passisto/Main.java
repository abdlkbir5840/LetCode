package com.passisto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static String longestCommonPrifix(String [] strs){
        StringBuilder longest = new StringBuilder();
        String shortString = "";
        String largeString = "";
        Arrays.sort(strs);
        shortString = strs[0];
        largeString = strs[strs.length - 1];
        if(strs.length < 1 || strs.length > 200 ||
                shortString.length() <= 0 || largeString.length() > 200) return "";
        for (int i = 0; i < Math.min(shortString.length(), largeString.length()); i++) {
            if (shortString.charAt(i) == largeString.charAt(i))
                longest.append(shortString.charAt(i));
            else
                break;

        }
        return longest.toString();
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow", "flight"};
//        String[] strs = new String[]{"ab", "a"};
        System.out.println(longestCommonPrifix(strs));
    }
}