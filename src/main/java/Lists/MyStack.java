package Lists;

public class MyStack<E> extends MyLinkedList<E> {
    public void push(E value){
        Node<E> newFirst = new Node<E>(value);
        newFirst.setNext(getHead());
        setHead(newFirst);
    }

    public E peek(){
       return (E) getHead().getItem();
    }

    public E pop(){
        Node<E> oldFirst = getHead();
        setHead(getHead().getNext());
        return oldFirst.getItem();
    }
}
