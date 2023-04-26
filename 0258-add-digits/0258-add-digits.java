class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int remainder = num % 10;
            num /= 10;
            num += remainder;
        }
        return num;
    }
}
