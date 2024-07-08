class Solution {
    public int maxProfit(int[] prices) {
        int buyingprice=prices[0];
    
        int profit=0;

        for(int i=1;i<prices.length;i++)
        {
          if(prices[i]<buyingprice)
          {
            buyingprice=prices[i];
          }
          else{
            profit=Math.max(profit,prices[i]-buyingprice);
          }
        }
        
    return profit;
}
}