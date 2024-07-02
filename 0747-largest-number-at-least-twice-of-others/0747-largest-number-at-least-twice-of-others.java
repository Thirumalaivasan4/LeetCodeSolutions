class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int idx=-1;
     for(int i=0;i<nums.length;i++){
             if(nums[i]>max){

             
               max=nums[i];
             idx=i;
             }
     }
     
     for(int i=nums.length-1;i>=0;i--){
        if(nums[i]==nums[idx]){
              continue;
        }
        if(nums[i]*2>max){
              return -1;
        }
     }
     return idx;  
    }
}