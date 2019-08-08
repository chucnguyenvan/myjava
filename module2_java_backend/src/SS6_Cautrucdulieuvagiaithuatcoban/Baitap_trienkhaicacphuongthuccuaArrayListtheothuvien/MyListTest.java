package SS6_Cautrucdulieuvagiaithuatcoban.Baitap_trienkhaicacphuongthuccuaArrayListtheothuvien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList=new MyList<Integer>();
        System.out.println(integerMyList.size());
        integerMyList.add(2);
        System.out.println(integerMyList.size());
        integerMyList.add(5);
        integerMyList.add(1);
        integerMyList.add(9);
        System.out.println(integerMyList.size());
        integerMyList.add(4,7);
        System.out.println(integerMyList.size());
        integerMyList.remove(3);
        System.out.println(integerMyList.size());
        System.out.println(integerMyList.contains(2));
        System.out.println(integerMyList.contains(0));
        System.out.println(integerMyList.indexOf(9));
        System.out.println(integerMyList.get(2));
        for (int i = 0; i < integerMyList.size(); i++) {
            System.out.println(integerMyList.get(i));
        }
        integerMyList.clear();
        System.out.println(integerMyList.size());
        for (int i = 0; i < integerMyList.size(); i++) {
            System.out.println(integerMyList.get(i));
        }
    }
}
