class Solution {
    public int rangeSum(int[] nums, int n, int l, int r) 
    {   
     int size=((n+1)*n)/2;
     int sum=0;
     int arr[]=new int[size];
     for(int i=0;i<n;i++)
     {
        for(int j=i;j<n;j++)
        {
            sum=0;
            for(int k=i;k<=j;k++)
            {
                 sum=sum+nums[k];
            }
            arr[--size]=sum;
        }
        
     }
      Arrays.sort(arr);
      long sum1=0;
      for(int i=l-1;i<r;i++){
        sum1+=arr[i];
      }
          return (int)(sum1%(1000000007));
    }
  
  
}