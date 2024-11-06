package TopInterview150.Array_String.BestTimetoBuyandSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int price = 0;
        int max = prices[0];
        int min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] >= max){
                max = prices[i];
                price = max - min > price ? max - min : price;
            }
            if(prices[i] <= min){
                min = prices[i];
                max = prices[i];
            }
        }

        return price;
    }
}