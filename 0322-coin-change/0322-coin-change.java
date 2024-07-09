class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=-1;

            }
        }
        int result=helper(coins,n,amount,dp);
       //return 0result == 1000 ? -1 : result; 
       
        return result == 100000 ? -1 : result; 
        
    }
    public int helper(int arr[],int n,int sum,int dp[][]){
        if (sum==0){
            return 0;
        }
        if(n==0)
        {
            return 100000;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        int take=100000;
        if(arr[n-1]<=sum){
            take=helper(arr,n,sum-arr[n-1],dp);
        }
        int nottake=helper(arr,n-1,sum,dp);
         return dp[n][sum]=Math.min(take+1,nottake);
    }
}