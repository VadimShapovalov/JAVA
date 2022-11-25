// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package com.example;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        int triangularNumber = 0;
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        for (int i = 1; i <= n; i++) {
           faktorial *= i;
        }
        System.out.printf("Треугольное число %d равно: %d \n", n, triangularNumber);
        System.out.printf("Факториал числа %d равен: %d", n, faktorial);
    }
}
