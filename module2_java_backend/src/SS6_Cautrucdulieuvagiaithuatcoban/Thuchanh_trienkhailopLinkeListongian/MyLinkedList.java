package SS6_Cautrucdulieuvagiaithuatcoban.Thuchanh_trienkhailopLinkeListongian;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        private Node( Object data) {
            this.data = data;
        }

        private Object getData() {
            return data;
        }
    }
    public void add(int index,Object data){
        Node temp = head;
        Node holder;
        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Object get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
