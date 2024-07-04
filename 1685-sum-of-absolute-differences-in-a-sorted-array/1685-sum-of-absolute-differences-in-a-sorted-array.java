class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
      
        int res[]=new int[n];
        
        int total=0;
        for(int i=0;i<n;i++)
        {
            total +=nums[i];  
        } 
           left[0]=0;
         for(int i=1;i<n;i++)
        {
           left[i]=left[i-1]+nums[i-1];
        }

         for(int i=0;i<n;i++)
        {
           int a=total-left[i];
           res[i]=Math.abs(left[i]-(nums[i]*i))+Math.abs ( (a-(nums[i]*(n-i))) );
           
        }
        
       
        
     
  return res;
    }
}