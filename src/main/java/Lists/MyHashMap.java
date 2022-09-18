package Lists;

import Collection.CollectionList;
import lombok.Getter;
import lombok.Setter;

public class MyHashMap<K,V> implements CollectionList{
    private Node<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 1 << 4;
    private int size = 0;

    public MyHashMap() {
        this(INITIAL_CAPACITY);
    }

    public MyHashMap(int capacity) {
        this.buckets = new Node[capacity];
    }

    public void put(K key, V value){
        if(key == null || value == null) {
            throw new NullPointerException();
        }

        Node<K, V> temp = new Node<>(key, value);

        int bucket = key.hashCode() % buckets.length;

        Node<K, V> current = buckets[bucket];
        if (current == null) {
            buckets[bucket] = temp;
            size++;
        } else {
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = temp;
                size++;
            }
        }
    }

    public boolean remove(K key) {
        int hash = key.hashCode() % buckets.length;
        if(buckets[hash] == null){
            return false;
        }
        if(buckets[hash] != null) {
            Node<K, V> previous = null;
            Node<K, V> current = buckets[hash];
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        buckets[hash] = buckets[hash].next;
                        size--;
                        return true;
                    }
                    if (previous != null) {
                        previous.next = current.next;
                        size--;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
        return false;
    }

    @Override
    public void clear() {
        if(size > 0){
            size = 0;
            for(int i = 0 ; i < buckets.length; i++){
                buckets[i] = null;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    public V get(K key){
        Node<K, V> bucket = buckets[key.hashCode() % buckets.length];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    @Getter
    @Setter
    private static class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
