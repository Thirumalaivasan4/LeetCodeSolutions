class Solution {
    public double findMaxAverage(int[] nums, int k) 
    { 
        int n=nums.length;
        double max=0;
        if(n<k){
            return max;
        }
        
        int current=0;

        for(int i=0;i<k;i++){
            current+=nums[i];
        }
        
         max=(double)current/k;
        for(int i=k;i<n;i++){
            int left=nums[i-k];
            int right=nums[i];
            current+=right-left;
           max= Math.max((double)current/4,max);
        }
      return max;  
    }
}