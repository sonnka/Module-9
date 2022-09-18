package Lists;

import Collection.CollectionList;

public class MyArrayList<E> implements CollectionList {
    private E[] values;

    public MyArrayList(){
        values = (E[]) new Object[0];
    }

    public void add(E value){
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        for(int i = 0; i < temp.length ; i++){
            values[i] = temp[i];
        }
        values[values.length - 1] = value;
    }

    public void remove(int index){
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        for (int i = 0; i < index ; i++){
            values[i] = temp[i];
        }
        for (int i = index + 1; i < temp.length ; i++){
            values[i - 1] = temp[i];
        }
    }

    @Override
    public void clear(){
        values = (E[]) new Object[0];
    }

    @Override
    public int size(){
        return values.length;
    }

    public E get(int index){
        return values[index];
    }
}
