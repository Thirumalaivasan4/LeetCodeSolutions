class Solution {
    public double averageWaitingTime(int[][] c) {
        int n=c.length;
       int arr[]=new int[n];
       int res[]=new int[n];
       arr[0]=c[0][0]+c[0][1];
       for(int i=1;i<n;i++)
       {
              
             if(c[i][0] <=arr[i-1])
             {
               arr[i]=arr[i-1]+c[i][1];
             }
             else
             {
                arr[i]=c[i][1]+c[i][0];
             }
          
       }
       int ans=0;
    
        for(int i=0;i<n;i++)
       {
         ans+=arr[i]-c[i][0];
        
       } 

       return (double)ans/n;
        
    }
}