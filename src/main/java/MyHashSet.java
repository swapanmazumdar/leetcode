import java.util.Arrays;
import java.util.LinkedList;

/**
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * Implement MyHashSet class:
 * <p>
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists in the HashSet or not.
 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 * <p>
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= key <= 106
 * At most 104 calls will be made to add, remove, and contains.
 * <p>
 * Disclaimer: The following solution is referenced from the Leetcode. All credits should be given Leetcode.
 */
class Bucket {
    private LinkedList<Integer> container = new LinkedList<>();

    public Bucket(Bucket bucket) {
    }

    void insert(Integer key) {
        if (container.indexOf(key) == -1) {
            container.addFirst(key);
        }
    }

    void delete(Integer key) {
        container.remove(key);
    }

    boolean exists(Integer key) {
        return container.contains(key);
    }
}

public class MyHashSet {

    private Bucket[] buckets;
    private int keyrange;

    public MyHashSet() {
        this.keyrange = 739;
        buckets = new Bucket[keyrange];
        buckets = Arrays.stream(buckets).map(Bucket::new).toArray(Bucket[]::new);
    }

    public int _hash(int key) {
        return key % keyrange;
    }

    public void add(int key) {
        this.buckets[_hash(key)].insert(key);
    }

    public void remove(int key) {
        this.buckets[_hash(key)].delete(key);
    }

    public boolean contains(int key) {
        return buckets[_hash(key)].exists(key);
    }

    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}