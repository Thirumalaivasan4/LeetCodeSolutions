class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        int ans=0;
        for(int i=(n/3);i<n;i=i+2)
        {
            ans+=piles[i];
        }
        return ans;
    }
}