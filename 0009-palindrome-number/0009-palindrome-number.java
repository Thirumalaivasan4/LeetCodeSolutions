class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(x<0){
            return false;
        }
        int rem;
        int sum=0;
        while(x>0)
        {
           rem=x%10;
           sum=(sum*10)+rem;
           x=x/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
}