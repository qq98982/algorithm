package com.home.henry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 * The same repeated number may be chosen from C unlimited number of times.
 * Note: All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [ [7], [2, 2, 3] ]
 */
public class CombinationSum {
    // Question 1: how to choose repeated numbers
    // Question 2: why positive integer

    List<List<Integer>> getCombinationSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        // Validate parameters
        if (null == nums || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);
        List<Integer> combination = new ArrayList<>();
        recursion(nums, combination, results, 0, target);
        return results;
    }

    private void recursion(int[] nums, List<Integer> combination, List<List<Integer>> results, int startIndex,
                           int remainToTarget) {
        if (remainToTarget == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (remainToTarget < nums[i]) {
                break;
            }
            combination.add(nums[i]);
            recursion(nums, combination, results, i, remainToTarget - nums[i]);
            combination.remove(combination.size() - 1);
        }
    }
}
