import java.util.List;
import java.util.LinkedList;
class MyHashSet {
    private int size;
    private List<Integer> hashSet;
    public MyHashSet() {
        hashSet = new LinkedList<>();
    }

    public void add(int key) {
        if (!hashSet.contains(key)) {
            hashSet.add(key);
            ++size;
        }
    }

    public void remove(int key) {
        if (hashSet.contains(key)) {
            hashSet.remove(Integer.valueOf(key));
            --size;
        }
    }

    public boolean contains(int key) {
        return hashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */