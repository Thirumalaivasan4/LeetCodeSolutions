class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int ans=0;
        int b=1;
        while(res!=0)
        {
            if((res&b)!=0){
                ans++;
            }
            res=res>>1;

        }
        return ans;
    }
}