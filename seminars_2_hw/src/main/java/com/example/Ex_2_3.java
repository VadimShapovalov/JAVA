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