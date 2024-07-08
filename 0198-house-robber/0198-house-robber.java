class Solution {
    public int rob(int[] nums) {
    int m=nums.length;
    int dp[]=new int[m+1];
    Arrays.fill(dp,-5);
    int ans= helper(nums,m,dp);
    
    return ans;  
    }
    public int helper (int a [],int n,int dp[])
    {
        if(n<=0)
        {
            return 0;
        }
        if(dp[n]!=-5){
            return dp[n];
        }

        int pick=a[n-1]+helper(a,n-2,dp);
        int notpick=0+helper(a,n-1,dp);
        dp[n]=Math.max(pick,notpick);
        return dp[n];
    }
}