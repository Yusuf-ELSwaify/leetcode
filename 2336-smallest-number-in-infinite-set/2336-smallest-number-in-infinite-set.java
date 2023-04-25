import java.util.PriorityQueue;
class SmallestInfiniteSet {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();
    int smallest = 1;
    public int popSmallest() {
        if (!queue.isEmpty())
            return queue.poll();
        return smallest++;
    }
    
    public void addBack(int num) {
        if (num < smallest && !queue.contains(num))
            queue.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */