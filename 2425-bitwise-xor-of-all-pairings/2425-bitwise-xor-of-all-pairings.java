class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
     int n=nums1.length;
     int m=nums2.length;
     if(n%2==0&&m%2==0){
        return 0;
     }
     else if(n%2!=0&&m%2==0)
     {
         int a=nums2[0];
         for(int i=1;i<m;i++){
            a=a^nums2[i];
         }
         return a;
     }
     else if(n%2==0&&m%2!=0)
     {
          int a=nums1[0];
         for(int i=1;i<n;i++){
            a=a^nums1[i];
         }
         return a;
     }
     else
     {
         int a=nums1[0];
         for(int i=1;i<n;i++)
         {
            a=a^nums1[i];
         }
         for(int i=0;i<m;i++)
         {
            a=a^nums2[i];
         }
         return a;
     }
    }
}