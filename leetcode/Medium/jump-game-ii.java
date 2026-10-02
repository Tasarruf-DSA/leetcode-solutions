// Problem: Jump Game II
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/jump-game-ii/
// Solved on: 2026-10-02T03:56:32.545Z

class Solution {
    public int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length-1;
        int coverage = 0, lastJumpIdx = 0;
        if(nums.length == 1) return 0;

        for(int i=0; i<nums.length; i++){
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIdx){
                lastJumpIdx = coverage;
                totalJumps++;

                //check if we reach the destination
                if(coverage >= destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}