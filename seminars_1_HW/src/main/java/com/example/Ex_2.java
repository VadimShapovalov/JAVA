// Вывести все простые числа от 1 до 1000

package com.example;

public class Ex_2 {
    public static void main(String[] args) {
        primeNumbers1000();
    }
    public static void primeNumbers1000() {
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 & i != j) {
                    break;
                } else {
                    if (i == j) {
                        System.out.printf("%d \n", i);
                    }

                }
            }

        }
    }
}
