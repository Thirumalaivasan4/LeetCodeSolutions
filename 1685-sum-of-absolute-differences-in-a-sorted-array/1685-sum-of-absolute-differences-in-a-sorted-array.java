class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n];
        
        int total=0;
        for(int i=0;i<n;i++)
        {
            total +=nums[i];  
        } 

           left[0]=0;
           right[0]=total;
           int j=0;
         for(int i=1;i<n;i++)
        {
           left[i]=left[i-1]+nums[i-1];
           right[i]=total-left[i];
           res[j]=Math.abs(left[j]-(nums[j]*j))+Math.abs ( (right[j]-(nums[j]*(n-j))) );
           j++;
        } 
       
         res[n-1]=Math.abs(left[n-1]-(nums[n-1]*(n-1)))+Math.abs ( (right[n-1]-(nums[n-1])) );
     
  return res;
    }
}