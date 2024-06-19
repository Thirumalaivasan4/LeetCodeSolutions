class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> lipos=new ArrayList<>();
        List<Integer> lineg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                lipos.add(nums[i]);
            }
            else
            {
                lineg.add(nums[i]);
            }
        }
        int n1=lipos.size();
        int n2=lineg.size();
        int p=0;
        int neg=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                res[i]=lipos.get(p);
                p++;
            }
            else if(i%2!=0)
            {
                res[i]=lineg.get(neg);
                neg++;
            }
        }
        return res;
    }
}