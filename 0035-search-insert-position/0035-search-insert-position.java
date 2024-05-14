class Solution {
    public int searchInsert(int[] nums, int k) 
    {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(nums[mid]==k){
                return mid;
            }
            else if(nums[mid]<k)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        return s;
    }
}