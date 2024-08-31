package com.passisto;

import java.util.*;

public class Main {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] nums = {1, 1, 2};
        long startTime = System.currentTimeMillis();
        System.out.println(removeDuplicates(nums));
        long endTime = System.currentTimeMillis();

    }
}