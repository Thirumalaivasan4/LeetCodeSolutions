class Solution {
    public void rotate(int[][] arr) {
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[i].length;j++){
            if(j>=i){
            int temp=arr[j][i];
            arr[j][i]=arr[i][j];
            arr[i][j]=temp;
            }
           
        }
        
       } 
       for(int i=0;i<arr.length;i++)
       {
          int s=0;
          int e=arr[i].length-1;
          while(s<e)
          {
            int temp=arr[i][e];
            arr[i][e]=arr[i][s];
            arr[i][s]=temp;
            s++;
            e--;
          }
       }
    }
}