class Solution {
    public int[] searchRange(int[] arr, int k) {
       return new int[]{bs(arr,k,true),bs(arr,k,false)} ;
    }
    static int bs(int arr[],int k,boolean check){
        int s=0;
        int e=arr.length-1;
        int  a=-1;
        while(s<=e){
            int m=s+(e-s)/2;

            if(arr[m]==k)
            {
                a=m;
                if(check){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
            else if(arr[m]<k){
                s=m+1;
            }
            else{
                e=m-1;
            }

        }
        return a;
    }
}