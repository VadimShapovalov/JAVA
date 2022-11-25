// Реализовать простой калькулятор

package com.example;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число (операнд х): ");
            double x = in.nextDouble();
            System.out.println("Введите второе число (операнд y): ");
            double y = in.nextDouble();
            System.out.println("Введите желаемую операцию: ");
            String op = in.next();
            if (op.equals("+")) {
                System.out.printf("%.3f + %.3f = %.3f", x, y, x + y);
            }
            if (op.equals("-")) {
                System.out.printf("%.3f - %.3f = %.3f", x, y, x - y);
            }
            if (op.equals("*")) {
                System.out.printf("%.3f * %.3f = %.3f", x, y, x * y);
            }
            if (op.equals("/")) {
                if (y == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.printf("%.3f / %.3f = %.3f", x, y, x / y);
                }
            }

        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные!");
        }
    }
}
