class Solution {
    public int findJudge(int n, int[][] arr) 
    {
       // List <List<Integer>> list=new ArrayList<>(); 
        int indegree[]=new int[n+1];
        int outdegree[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            
                outdegree[arr[i][0]]++;
                indegree[arr[i][1]]++;
        }
        
        for(int i=0;i<=n;i++)
        {
            if(indegree[i]==n-1&&outdegree[i]==0)
            {
                       return i;
            }
        }
        return -1;

    }
}