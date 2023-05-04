class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();
        int len = senate.length();

        for (int i = 0; i < len; i++)
            if (senate.charAt(i)  == 'R')
                qR.offer(i);
            else
                qD.offer(i);

        while (!qR.isEmpty() && !qD.isEmpty())
        {
            int r = qR.poll();
            int d = qD.poll();
            if (r < d)
                qR.offer(r + len);
            else
                qD.offer(d + len);
        }
        return (qR.size() > qD.size() ? "Radiant" : "Dire");
    }
}