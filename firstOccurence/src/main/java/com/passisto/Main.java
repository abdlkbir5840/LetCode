package com.passisto;

public class Main {
    public static int strStr(String haystack, String needle){
        int index = -1;
        block:
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.length()-i>=needle.length() && haystack.substring(i, i+ needle.length()).equals(needle)){
                    index = i;
                    break block;
                };
            }
        }
        return index;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(strStr(s1, s2));
    }
}