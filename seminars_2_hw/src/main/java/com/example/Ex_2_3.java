// В файле содержится строка с данными:

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
//  Студент Краснов получил 5 по предмету Физика.


package com.example;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex_2_3 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("student.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            StringBuilder strB = new StringBuilder();
            String s = new String(scanner.nextLine().toString());
            String[] str = s.split(":");

            int length = str[1].lastIndexOf("оценка");
            int length2 = str[3].lastIndexOf("}");

            strB.append("Студент ");
            strB.append(str[1], 1, length-3);
            strB.append(" получил ");
            strB.append(str[2], 1, 2);
            strB.append(" по предмету ");
            strB.append(str[3], 1, length2-1);
            System.out.println(strB.toString());
            }
            reader.close();
            scanner.close();
        }
    }