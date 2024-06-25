class Solution {
    public List<Integer> spiralOrder(int[][] arr)
    {
       int sc=0;
       int ec=arr[0].length-1;
       int sr=0;
       int d=0;
       int er=arr.length-1;
       List<Integer> list=new ArrayList<Integer>();
       while(sr<=er&&sc<=ec)
       {
           if(d==0){
            for(int i=sc;i<=ec;i++)
            {
                list.add(arr[sr][i]);
                System.out.println(arr[sr][i]);

            }
            sr++;
            d++;
           }
           else if(d==1){

          
            for(int i=sr;i<=er;i++)
            {
                System.out.println(arr[i][ec]);
                list.add(arr[i][ec]);

            }
            ec--;
            d++;
             }
     

        else if(d==2){

        
            for(int i=ec;i>=sc;i--)
            {
                System.out.println(arr[er][i]);
                list.add(arr[er][i]);

            }
           er--;
           d++;
        }
            else{

            
            for(int i=er;i>=sr;i--)
            {
                System.out.println(arr[i][sc]);
                list.add(arr[i][sc]);

            }
            sc++;
            d=0;
            }



       }
       return list; 
    }
}