public class Solution {
    public int maxProfit(int prices[]) {
    int profit = 0;
    int maxPro = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < prices.length; i++){
        min = Math.min(min,prices[i]);
        profit = prices[i] - min;
        if(profit > maxPro){
            maxPro = profit;
        }
    }
    return maxPro;
}
}
