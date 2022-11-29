

//В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split.
// Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.''''

package com.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex_2_1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("text_1.txt");
        Scanner scanner = new Scanner(reader);
        StringBuilder strB = new StringBuilder();
        String s = new String(scanner.nextLine().toString());
        String[] str = s.split(":");

        int length = str[1].lastIndexOf("country");
        int length2 = str[2].lastIndexOf("city");
        int length3 = str[3].lastIndexOf("age");

        strB.append("SELECT * FROM students WHERE name = \"");
        strB.append(str[1], 1, length-3);
        strB.append(" AND country = ");
        strB.append(str[2], 0, length2-3);
        strB.append(" AND city = ");
        strB.append(str[3], 0, length3-3);
        strB.append(";");
        
        System.out.println(strB.toString());
        scanner.close();
    }
}
