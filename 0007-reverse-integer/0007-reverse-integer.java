class Solution {
    public int reverse(int x) {
        long res = 0;
        boolean neg = false;

        if (x < 0) {
            neg = true;
            x = -x;
        }
        
        while (x != 0)
        {
            res = (res * 10) + (x % 10);
            x /= 10;
        }
        
        if (res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE)
            return 0;
        
        return  (int) (neg ? -res : res);
    }
}