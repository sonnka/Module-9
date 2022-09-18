import Lists.*;

public class Tester {
    public static void main(String[] args){
        MyArrayList<String> arrayList = new MyArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("ArrayList :");
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.get(2));
        arrayList.clear();
        System.out.println(arrayList.size());

        MyLinkedList<String> linkedList = new MyLinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        System.out.println("LinkedList :");
        System.out.println(linkedList.size());
        linkedList.remove("c");
        System.out.println(linkedList.get(2));
        linkedList.clear();
        System.out.println(linkedList.size());

        MyQueue<String> queue = new MyQueue();

        queue.add("Aa");
        queue.add("Bb");
        queue.add("Cc");
        queue.add("Dd");

        System.out.println("Queue :");
        System.out.println(queue.size());
        queue.remove("Cc");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.get(0));
        System.out.println(queue.size());

        MyStack<String> stack = new MyStack<>();

        stack.push("Aa");
        stack.push("Bb");
        stack.push("Cc");
        stack.push("Dd");

        System.out.println("Stack :");
        System.out.println(stack.size());
        stack.remove("Cc");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.get(0));
        System.out.println(stack.size());

        MyHashMap<Integer,String> hashMap = new MyHashMap();

        hashMap.put(78,"Ann");
        hashMap.put(29,"Ben");
        hashMap.put(36,"Sam");
        hashMap.put(14,"Olga");
        hashMap.put(29,"Tom");
        hashMap.put(64,"Kate");
        hashMap.put(48,"Peter");

        System.out.println("HashMap :");
        System.out.println(hashMap.size());
        hashMap.remove(14);
        System.out.println(hashMap.get(29));
        hashMap.clear();
        System.out.println(hashMap.size());

    }
}
