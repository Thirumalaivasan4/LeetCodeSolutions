class Solution {
    public int[] platesBetweenCandles(String s, int[][] q) {
       int result[]=new int[q.length] ;
    
         for(int i=0;i<q.length;i++)
         {
           int start = q[i][0];
           int end = q[i][1];
        
               String str = s.substring(start, end + 1); // inclusive of end
               System.out.println(str);
int p1 = 0;
int p2 = str.length() - 1;

while (p1 <= p2) {
    if (str.charAt(p1) != '|') {
        p1++;
    }

    if (str.charAt(p2) != '|') {
        p2--;
    }

    if (str.charAt(p1) == '|' && str.charAt(p2) == '|') {
        break;
    }
}

        int count =0;
       for(int j=p1;j<=p2;j++)
       {
            if(str.charAt(j)=='*')
            {
                 count++;
            }
       }
       result[i]=count;
         }
       return result;
    }
}