// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex_5_2 {
    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("Иван");
    list.add("Петр");
    list.add("Иван");
    list.add("Дима");
    list.add("Иван");
    list.add("Дима");
    list.add("Петр");
    list.add("Петр");
    list.add("Иван");
    list.add("Наташа");
    list.add("Иван");
    list.add("Маша");
    list.add("Адам");
    Map<String, Integer> dict = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(!dict.containsKey(list.get(i))) {
                dict.put(list.get(i), 1);
            }
            else if (dict.containsKey(list.get(i))) {
               int count = dict.get(list.get(i));
               count += 1;
               dict.put(list.get(i), count);
            }
        }
        System.out.println(dict);

        dict.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
}
}