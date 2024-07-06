public class Solution {

    public boolean isHappy(int n) {
        return helper(n, 0);
    }

    public int changer(int n) {
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        return sum;
    }

    boolean helper(int n, int count) {
        if (n == 1) {
            return true;  
        }
        if (count >= 10) {
            return false;  
        }
        int a = changer(n);  
        return helper(a, count + 1); 
            }
}
