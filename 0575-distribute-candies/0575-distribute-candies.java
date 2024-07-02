class Solution {
    public int distributeCandies(int[] arr) {
     int limit=arr.length/2;
     Arrays.sort(arr);
     int ans=1;
    
     for(int i=0;ans<limit&&i<arr.length-1;i++)
     {
         if(arr[i]!=arr[i+1]){
            ans++;
         }
         
     }
     return ans;
    }
}