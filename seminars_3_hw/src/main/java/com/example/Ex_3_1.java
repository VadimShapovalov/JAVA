// Реализовать алгоритм сортировки слиянием

package com.example;
import java.util.Arrays;
import java.util.Random;

public class Ex_3_1 
{
    public static void main( String[] args )
    {
        int[] array = createAndPrintArray(20);

        System.out.println(Arrays.toString(sortArray(array)));

    }

    public static int[] createAndPrintArray(int size){ 
        int[] array = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(77);
            System.out.print(array[i] + " ");
        }
            System.out.println();
            return array;
    }

    private static int[] mergeArray(int[] array1, int[] array2){
        int[] array = new int[array1.length + array2.length];   
        int position_1 = 0, position_2 = 0;
        for(int i = 0; i < array.length; i++){
            if(position_1 == array1.length){    
                array[i] = array2[position_2];
                position_2++;
            }else if(position_2 == array2.length){   
                array[i] = array1[position_1];
                position_1++;
            }else if(array1[position_1] < array2[position_2]){ 
                array[i] = array1[position_1];
                position_1++;
            }else{
                array[i] = array2[position_2];
                position_2++;
            }
        }
        return array; 
    }
    private static int[] sortArray(int[] array) {
        if(array == null) return null;         
        if(array.length == 1){  
            return array;
        }else{  
            int[]  array1 = new int[array.length/2];        
            int[]  array2 = new int[array.length - array.length/2];     
            System.arraycopy(array, 0, array1, 0, array.length/2);     
            System.arraycopy(array, array.length/2, array2, 0, array.length - array.length/2);  
            
            return mergeArray(sortArray(array1),sortArray(array2)); 
        }
    }
}
