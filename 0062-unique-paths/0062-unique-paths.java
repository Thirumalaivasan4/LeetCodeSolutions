class Solution {
    public int uniquePaths(int m, int n) 
    {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
       return  helper(m,n,dp);
    }
    int helper(int m, int n,int dp[][]){
        if(m==1||n==1)
        {
            return dp[m-1][n-1]=1;
        }
        if(dp[m-1][n-1]!=-1){
            return dp[m-1][n-1];
        }
        int down=helper(m-1,n,dp);
        int right=helper(m,n-1,dp);
        return dp[m-1][n-1]=down+right;
    }
}