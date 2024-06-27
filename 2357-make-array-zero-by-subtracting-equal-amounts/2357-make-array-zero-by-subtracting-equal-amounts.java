class Solution {
    public int minimumOperations(int[] arr) {
        //int i=0;
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {      
               if(arr[i]!=0)
               {
               int x=arr[i];
               
               for(int j=i;j<arr.length;j++)
               {
                  arr[j]=arr[j]-x;
                 
               }
               
               count++;
               
               }
               }
               
            

        return count;
    }
}