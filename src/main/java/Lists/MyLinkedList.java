package Lists;

import Collection.CollectionList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyLinkedList<E> implements CollectionList{
    private Node<E> head;

    public void add(E value){
        if(head == null){
            head = new Node<E>(value);
        }else{
            Node<E> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node<E>(value);
        }
    }

    public boolean remove(E value) {
        if(head == null){
            throw new NullPointerException();
        }
        if(head.item.equals(value)) {
            head = head.next;
            return true;
        }
        Node<E> current = head;
        while(current.next != null){
            if(current.next.item.equals(value)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;

    }

    @Override
    public void clear() {
        Node<E> current = head;
        head = null;
        while(current.next != null){
            Node<E> temp = current.next;
            current.next = null;
            current = temp;
        }
    }

    @Override
    public int size() {
        if(head == null){
            return CollectionList.super.size();
        }
        int count = 1;
        Node<E> current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public E get(int index){
        if(head == null || index < 0 || size() <= index){
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        Node<E> current = head;
        while(current.next != null && count < index){
            current = current.next;
            count++;
        }
        return current.item;
    }

    @Setter
    @Getter
    protected static class Node<E>{
        private E item;
        private Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
}