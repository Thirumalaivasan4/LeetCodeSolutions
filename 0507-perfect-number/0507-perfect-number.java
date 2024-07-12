class Solution {
    public boolean checkPerfectNumber(int n) {
        int a=0;
        for(int i=1;i<n-1;i++){
            if (n%i==0){
                a+=i;
            }
        }
        if(a==n){
            return true;
        }
        return false;
    }
}