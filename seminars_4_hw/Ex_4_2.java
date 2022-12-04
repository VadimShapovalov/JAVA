// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first()first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Ex_4_2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Первоначальный список (очередь) = ");
        System.out.println(list);
        enqueue(list, 6);
        System.out.print("Результат метода enqueue() = ");
        System.out.println(list);
        System.out.print("Результат метода dequeue() = ");
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.print("Результат метода first() = ");
        System.out.println(first(list));
        System.out.println(list);
    }

    public static LinkedList enqueue(LinkedList<Object> list, Object ob) { //  помещает элемент в конец очереди
        list.addLast(ob);
        return list;
    }

    public static Object dequeue(LinkedList<Object> list) { //  возвращает первый элемент из очереди и удаляет его
        Object first = list.getFirst();
        list.removeFirst();
        return first;
    }

    public static Object first(LinkedList<Object> list) { //  возвращает первый элемент из очереди, не удаляя
        return list.getFirst();
    }
}
