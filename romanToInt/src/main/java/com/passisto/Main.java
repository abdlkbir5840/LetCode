package com.passisto;

public class Main {
    public static int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            switch (s.charAt(i)){
                case 'I':
                    if(i+1 < s.length() && s.charAt(i+1)=='V'){
                        result += 4;
                        i++;
                    }else if(i+1 < s.length() && s.charAt(i+1)=='X'){
                        result += 9;
                        i++;
                    }else{
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if(i+1 < s.length() && s.charAt(i+1)=='L'){
                        result += 40;
                        i++;
                    }else if(i+1 < s.length() && s.charAt(i+1)=='C'){
                        result += 90;
                        i++;
                    }else{
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(i+1 < s.length() && s.charAt(i+1)=='D'){
                        result += 400;
                        i++;
                    }else if(i+1 < s.length() && s.charAt(i+1)=='M'){
                        result += 900;
                        i++;
                    }else{
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("XVIV"));
    }
}