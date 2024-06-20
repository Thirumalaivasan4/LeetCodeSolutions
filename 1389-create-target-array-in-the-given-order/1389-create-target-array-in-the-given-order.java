class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        ArrayList<Integer> list =new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
          list.add(index[i],nums[i]);
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}