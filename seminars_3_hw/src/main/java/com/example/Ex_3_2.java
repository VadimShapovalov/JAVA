// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package com.example;
import java.util.ArrayList;
import java.util.Random;

public class Ex_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            array.add(rand.nextInt(10));
        }
        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        System.out.println(array);
        }
    }