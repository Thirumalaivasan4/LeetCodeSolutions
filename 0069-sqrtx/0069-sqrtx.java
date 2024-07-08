class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        long s = 1;
        long e = x;
        
        while (s <= e) {
            long mid = s + (e - s) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int)mid;
            } else if (square < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        
        return (int)e;
    }
}
