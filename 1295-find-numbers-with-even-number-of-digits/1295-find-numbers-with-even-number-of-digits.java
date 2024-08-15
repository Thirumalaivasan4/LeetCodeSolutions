class Solution {
    public int findNumbers(int[] nums) 
    {
        int c=0; 
     for(int i=0;i<nums.length;i++)
     {
        if((helper(nums[i]))%2==0)
        {
            c++;
        }
     }
     return c;
    }
    int helper(int n)
    {
         String s=n+"";

         
        
         return s.length();
    }
}