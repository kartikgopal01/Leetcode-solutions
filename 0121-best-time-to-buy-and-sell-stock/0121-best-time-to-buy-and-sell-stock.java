class Solution {
    public int maxProfit(int[] prices) {
    int buy=prices[0];
    int n=prices.length;
    int profit=0;
    for(int i=0;i<n;i++){
        if(buy>prices[i]){
            buy=prices[i];
        }
        profit=Math.max(profit,prices[i]-buy);
    }
    return profit;
    }
}