package com.home.henry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, S, return all possible subsets.
 * Note: Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example, If S = [1,2,3], a solution is:
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 */
public class SubSet {
    private List<List<Integer>> getSublist(int[] nums) {
        // Init a list to receive results
        List<List<Integer>> results = new ArrayList<>();

        // Validate input
        if (null == nums || nums.length < 1) {
            return results;
        }

        // Sort nums
        Arrays.sort(nums);
        // Use recursion to get results
        List<Integer> subset = new ArrayList<>();
        recusion(subset, nums, 0, results);
        return results;
    }

    // Recursion part
    private void recusion(List<Integer> subset, int[] nums, int startIndex,
                          List<List<Integer>> results) {
        // Deep copy
        results.add(new ArrayList<>(subset));

        // for loop
        for (int j = startIndex; j < nums.length; j++) {
            // In for loop 1. add current point 2. exec recursion 3. restore current point
            subset.add(nums[j]);
            recusion(subset, nums, j + 1, results);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 6 };
        SubSet subSet = new SubSet();
        List<List<Integer>> sublist = subSet.getSublist(nums);
        assert 16 == sublist.size();
        sublist.forEach(x -> {
            System.out.println();
            System.out.println(x);
        });
    }
}
