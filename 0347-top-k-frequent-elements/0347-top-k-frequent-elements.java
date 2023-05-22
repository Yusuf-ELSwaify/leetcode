import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Map.Entry;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
    	Queue<Integer> heap = 
            new PriorityQueue<>(k + 1,
                (a,b) -> Integer.compare(freq.get(a), freq.get(b)));
    	int[] res = new int[k];
        
    	for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);
    	
        for (Entry<Integer, Integer> e : freq.entrySet()) {
            heap.offer(e.getKey());
            if (heap.size() > k)
            	heap.poll();
         }
        
        for (int i = k - 1; i >= 0; i--)
        	res[i] = heap.poll();
        
    	return res;
    }
}