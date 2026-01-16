class Solution {
    public int maxProfit(int[] prices) {
        int max_profit =0;
        int min_profit = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min_profit = Math.min(min_profit,prices[i]);
            max_profit = Math.max(max_profit,prices[i]-min_profit);
        }
        return max_profit;
    }
}