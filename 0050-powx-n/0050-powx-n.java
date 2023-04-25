class Solution {
    public double myPow(double x, int n) {
        
        if (n == 0)
            return 1;
        if (n < 0)
        {
            n = -n;
            x = 1 / x;
        }

        double pow = myPow(x, n / 2);
        double val = pow * pow * (n % 2 == 1 ? x : 1);
        if (val < -10000 || val > 10000) {
            return 0;
        }
        return val;
    }
}