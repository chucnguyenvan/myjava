package SS6_Cautrucdulieuvagiaithuatcoban.Baitap_trienkhaicacphuongthuclopLikelisttheothuvienjava.util.LinkedList;

public class MyLinkeList<E> {
    private Node head;
    private int numNode = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyLinkeList() {
        this.head = head;
        this.numNode = numNode;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNode++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        temp.next.next = null;
        numNode++;
    }

        public E remove(int index){
        Node temp = head;
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder=temp.next;
        temp.next=holder.next;
        numNode--;
        return (E) holder;
    }
    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }
    public E getFirst(){
        return (E) head.data;
    }
    public E getLast(){
        Node temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.data;
    }
    public int indexOf(E e){
        Node temp=head;
        for (int i = 0; i <numNode; i++) {
            if (temp.data==e){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
    public int size(){
        return numNode;
    }
    public boolean add(E e){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        temp.next.next = null;
        numNode++;
        return false;
    }
    public boolean contains(E o){
        Node temp =head;
        for (int i = 0; i <numNode ; i++) {
            if(temp.data==o){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void clear(){

    }

    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
