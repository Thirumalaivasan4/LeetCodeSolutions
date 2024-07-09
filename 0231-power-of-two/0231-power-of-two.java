class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0){
            return false;
        }
        boolean ans=(n&(n-1))==0? true: false;
        return ans;
        }
        
    }
