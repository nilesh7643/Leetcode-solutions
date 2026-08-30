class Solution {
    public int maxProfit(int[] prices) {
    int lowest = prices[0];
    int maxProfit =0;
    for (int i= 0; i<prices.length; i++){
        if (prices[i]<lowest){
            lowest = prices[i];
        }else {
            int profit = prices[i]-lowest;  

            if (profit> maxProfit ){
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
    }
}