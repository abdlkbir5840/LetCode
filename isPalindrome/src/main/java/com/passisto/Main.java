package com.passisto;

public class Main {
    public static boolean isPalindrome(int x) {
        char[] tab = String.valueOf(x).toCharArray();
        char[] invers = new char[tab.length];
        int i = 0;
        int j = 0;
        boolean res = true;
        for (i = tab.length-1; i >= 0; i--){
            invers[j] = tab[i];
            j++;
        }
        j = tab.length-1;
        for(i = 0; i < tab.length ; i++){
            if(tab[i] != invers[i]){
                res = false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(141));
    }
}