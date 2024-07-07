class Solution {
    public int numWaterBottles(int numBottles, int numExchange) 
    {
         int q=0;
         int r=0;
        int a=numBottles;
        while(numBottles>=numExchange)
        {
        r=numBottles%numExchange;
        q=numBottles/numExchange;
        a+=q;
        numBottles=q+r ;  
        }
       return a;
    }
}