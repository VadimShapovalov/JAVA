// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package com.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Ex_2_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Ex_2_2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        //logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);

        int [] mas = {11, 3, 14, 16, 7};
        int [] res = new int[5];
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    res = mas;

                    System.out.println(Arrays.toString(mas));
                    logger.addHandler(fh);
                    logger.log(Level.INFO, Arrays.toString(mas));
                    // logger.info(Arrays.toString(mas));

                }
            
            }

        }

    }
}