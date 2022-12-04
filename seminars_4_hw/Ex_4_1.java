// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Ex_4_1 {
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(reverse(list));

    }
        public static LinkedList reverse(LinkedList list) {
            LinkedList<Object> reverslist = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                reverslist.addFirst(list.get(i));
            }
            return  reverslist;
        }
}
