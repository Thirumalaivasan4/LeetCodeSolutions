class Solution {
    public int passThePillow(int n, int t) 
    {   
        int r=t%(n-1);
        int q=t/(n-1);

        if(q%2==0)
        {
            return r+1;
        }   
            return n-r;                                                              
        }
    }                                         
