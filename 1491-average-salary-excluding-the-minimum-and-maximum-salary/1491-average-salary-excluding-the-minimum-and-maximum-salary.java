class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = 0;
        double total = 0;
        for (int s : salary)
        {
            if (s < min)
                min = s;
            if (s > max)
                max = s;

            total += s;
        }
        return ((total - min - max) / (salary.length - 2));
    }
}