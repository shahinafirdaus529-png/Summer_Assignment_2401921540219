class Solution {

    public int maxProfit(int[] stockPrices) {

        int minimumPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for(int price : stockPrices) {

            if(price < minimumPrice) {
                minimumPrice = price;
            }

            int currentProfit = price - minimumPrice;

            if(currentProfit > maximumProfit) {
                maximumProfit = currentProfit;
            }
        }

        return maximumProfit;
    }
}
