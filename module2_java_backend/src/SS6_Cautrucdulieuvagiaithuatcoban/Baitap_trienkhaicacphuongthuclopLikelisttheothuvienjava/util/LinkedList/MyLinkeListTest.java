package SS6_Cautrucdulieuvagiaithuatcoban.Baitap_trienkhaicacphuongthuclopLikelisttheothuvienjava.util.LinkedList;

public class MyLinkeListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkeList<Integer> ll = new MyLinkeList<Integer>();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(8);
        ll.add(4,9);
        ll.add(4,6);
        ll.addLast(7);
        ll.add(5);
        ll.remove(5);
        System.out.println(ll.get(3));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.contains(12));
        System.out.println(ll.contains(1));
        System.out.println("chiso"+ll.indexOf(7));
        ll.printList();
        System.out.println(ll.size());
    }
}
