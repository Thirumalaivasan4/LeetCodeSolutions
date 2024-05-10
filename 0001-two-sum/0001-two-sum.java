class Solution {
    public int[] twoSum(int[] nums, int k) {
        int index[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=nums.length-1;j++)
          {
                  if(nums[i]+nums[j]==k){
            
                        index[0]=i;
                        index[1]=j;
            
                  }
          }
        
    }
   return index;
    }
}