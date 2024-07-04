class Solution {
    public int minTimeToVisitAllPoints(int[][] points)
    {
        int x=points[0][0];
        int y=points[0][1];
        int ans=0;
      for(int i=1;i<points.length;i++)
      {
       int x2=points[i][0];
       int y2=points[i][1];
       ans+= Math.max(Math.abs(x2-x),Math.abs(y2-y));
       x=x2;
       y=y2;
      }
      return ans;  
    }
}