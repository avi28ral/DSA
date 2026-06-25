class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max =0 ;
        int profit = 0;
        while(max < prices.length){
            int temp = prices[max] - prices[min];
            if(temp<0){
                min = max;
                max++;
                
            }
            else if(temp <= profit){
                max++;
            }else{
                profit = temp;
                max++;
            }
        }
        return profit;
    }
}