class Solution {
    public int myAtoi(String s) {
        boolean neg = false;
        long n = 0;
        int i = 0, len = s.length();

        if (len == 0)
            return 0;
        
        while (s.charAt(i) == ' ')
            if (i == len - 1)
                return 0;
            else
                i++;
        
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
    		if (s.charAt(i) == '-')
                neg = !neg;
            i++;
        }

        for(; i < len; i++)
        {
        	char c = s.charAt(i);

        	if(c >= '0' && c <= '9') 
            {
        		n= (n * 10) + (c - '0');
                
                if (n > Integer.MAX_VALUE) {
                    if (neg)
                        return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                
            }
            else
                break;
        }
        
        return (int) (neg ? (-n) : n);
    }
}