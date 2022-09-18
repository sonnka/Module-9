package Lists;

public class MyQueue<E> extends MyLinkedList<E> {

    public E peek(){
        Node<E> temp = getHead();
        if(temp != null) {
            return temp.getItem();
        }else {
            throw new NullPointerException();
        }
    }

    public E poll(){
        Node<E> temp = getHead();
        if(temp != null) {
            remove(temp.getItem());
            return temp.getItem();
        }else {
            throw new NullPointerException();
        }
    }
}
