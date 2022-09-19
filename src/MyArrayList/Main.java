package MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.addOfindex(0, 7);
        System.out.println(list);
        System.out.println(list.get(5));


    }
}

