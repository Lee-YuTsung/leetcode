package TopInterview150.Array_String.BestTimetoBuyandSellStockII;

class Solution {
    public int maxProfit(int[] prices) {
        int price = 0;
        int low = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < low){
                low = prices[i];
            }else if(prices[i] > low && (i == prices.length - 1 || prices[i] > prices[i + 1])){
                price += prices[i] - low;
                low = prices[i];
            }
        }

        return price;
    }
}
