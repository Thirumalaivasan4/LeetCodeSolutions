class Solution {
    public int passThePillow(int n, int t) 
    {   
        if(t<n)
        {
            return t+1;
        }
        else
        {
        if(t%n==0)
        {
            return n-1;
        }  
        int r=t%n;
        int q=t/n;

        if(r>q)
        {
            return n-r-q;
        }   
            return n-r+q;                                                                  
        }
    }                                         
}