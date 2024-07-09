class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=helper(i);
        }
        return dp;
    }
    static int helper(int n){
        int count=0;
        String b = Integer.toBinaryString(n);
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1')
                count++;
        }
        return count;

    }
}