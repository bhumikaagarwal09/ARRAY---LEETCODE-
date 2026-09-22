class Solution {
    public int maxProfit(int[] prices) {

        int left = 0; //buying day 
        int right = 1; //selling day 
        int maxProfit = 0;

        while (right < prices.length) {

            if (prices[left] < prices[right]) {// find a profit 

                int profit = prices[right] - prices[left];

                if (profit > maxProfit) {
                    maxProfit = profit; // another day buy 
                }

            } else {
                left = right; // will move to left 
            }

            right++; //selling pointer to the next day 
        }

        return maxProfit;
    }
}
