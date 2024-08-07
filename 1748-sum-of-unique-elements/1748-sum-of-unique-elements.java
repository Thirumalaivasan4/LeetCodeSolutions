class Solution {
    public int sumOfUnique(int[] nums) {
      int arr[]=new int [100+1];
      for(int i:nums){
        arr[i]++;
      }
      int s=0;
      for(int i=0;i<nums.length;i++){
        if(arr[nums[i]]==1)
           s+=nums[i];
      }
      return s;

    }
}