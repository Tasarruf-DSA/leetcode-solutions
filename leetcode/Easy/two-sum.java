// Problem: Two Sum
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/two-sum/
// Solved on: 2026-10-01T06:42:03.919Z

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[] {map.get(required), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}