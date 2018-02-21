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
    // Question 1: how to choose repeated numbers.
    // Question 2: why positive integer.

    List<List<Integer>> getCombinationSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        // Validate parameters.
        if (null == nums || nums.length == 0) {
            return results;
        }

        // Sort int[] first
        Arrays.sort(nums);
        List<Integer> combination = new ArrayList<>();
        recursion(nums, combination, results, 0, target);
        return results;
    }

    private void recursion(int[] nums, List<Integer> combination, List<List<Integer>> results, int startIndex,
                           int remainToTarget) {
        // If it reaches target, add it to results, else not.
        // This is the end condition of this recursion.
        if (remainToTarget == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            // Add efficiency
            if (remainToTarget < nums[i]) {
                break;
            }
            // For repeated numbers in nums.
            if (i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            combination.add(nums[i]);
            // i is for repeat selecting numbers, because it can choose
            // repeated numbers, it is not suitable to use non positive numbers.
            recursion(nums, combination, results, i, remainToTarget - nums[i]);
            combination.remove(combination.size() - 1);
        }
    }
}
