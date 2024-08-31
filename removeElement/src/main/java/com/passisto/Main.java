package com.passisto;

import java.util.LinkedHashMap;

public class Main {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}