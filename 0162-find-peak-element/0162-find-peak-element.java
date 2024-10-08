class Solution {
    public int findPeakElement(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<e){
            int m=s+((e-s)/2);
            if(arr[m]>arr[m+1])
            {
                e=m;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}