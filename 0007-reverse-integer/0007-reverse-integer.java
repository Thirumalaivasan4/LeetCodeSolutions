class Solution {
    public int reverse(int n) {
        long reversed = 0;
        int a;
        while (n != 0) 
        {
           
             reversed = (reversed * 10) + n % 10;
            
            if (reversed > Integer.MAX_VALUE ||reversed < Integer.MIN_VALUE) {
                return 0; 
            }
            n /= 10;
        }
    
        return (int)reversed;
       
    }
}