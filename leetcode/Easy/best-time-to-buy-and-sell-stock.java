// Problem: Best Time to Buy and Sell Stock
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Solved on: 2026-10-06T18:41:57.446Z

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            minPrice = Math.min(minPrice, price);

            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}