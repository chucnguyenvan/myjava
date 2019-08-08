package SS6_Cautrucdulieuvagiaithuatcoban.Baitap_trienkhaicacphuongthuccuaArrayListtheothuvien;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    static final int DEFAULT_CAPACITY=10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length +5;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E element){
        if (index> size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        if(elements.length==size){
            this.ensureCapa();
        }
        for (int i = this.size; i >index; i--) {
            elements[i]=elements[i-1];
        }
        elements[index]=element;
        size++;
    }
    public void add(E e){
        if(elements.length==size){
            this.ensureCapa();
        }
        elements[size++]=e;
    }
    public E remove(int index){
        for (int i = index; i < this.size-1; i++) {
            elements[i]=elements[i+1];
        }
        elements[size]=null;
        size--;
        return (E) elements;
    }
    public int size(){
        return this.size;
    }
    public E get (int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public boolean contains(E o){
        for (int i = 0; i < this.size; i++) {
            if(elements[i]==o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < this.size; i++) {
            if(elements[i]==o){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for (int i = size; i >0; i--) {
            this.remove(i-1);
        }
    }
}
