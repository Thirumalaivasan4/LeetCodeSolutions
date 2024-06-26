class Solution {
    public int[] singleNumber(int[] nums) 
    {
          
        int arr[]=new int[2];
        int ans=nums[0];
       for(int i=1;i<nums.length;i++)
         {
           ans=ans^nums[i];
         }  
         int first_set=0;
         int second_set=0;
        int count=0;
        while((ans&1)!=1)
        {
         count++;
         ans=ans>>1;
                                          
        }
        for(int num:nums)
        {
          if(((num>>count)&1)==1)
          {
              first_set=first_set^num;
          }
          else{
            second_set=second_set^num;
          }
        }
            return  new int[]{first_set,second_set};                                                                                                                
        
    }
    
   
}