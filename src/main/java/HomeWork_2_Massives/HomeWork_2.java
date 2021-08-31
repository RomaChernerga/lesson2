package HomeWork_2_Massives;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork_2 {
    public static void main(String[] args) {

        // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


        int [] intArray1 = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        for (int a = 0; a < intArray1.length; a++){
            if(intArray1[a] == 0){
                intArray1[a] = 1;
            } else{
                intArray1[a] = 0;
            }
                System.out.print(intArray1[a] + " ");
        }
        System.out.println();


        //Задание 2.Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int [] intArray2 = {0,3,6, 9, 12, 15, 18, 21};
        for (int i = 0; i < intArray2.length; i++){
            System.out.print(intArray2[i] + " ");
        }
        System.out.println();

        //Задание 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2
        int [] intArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int j=0; j< intArray3.length; j++ ){
            if(intArray3[j] < 6){
                intArray3[j] = intArray3[j] * 2;
            }else{
                intArray3[j] = intArray3[j];
            }
            System.out.print(intArray3[j] + " ");
        }
        System.out.println();



        

        //Задание 4.**Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
        int[] intArray4 = {6, 5, 9, 10, 13, 17, 2, 7};
       // int min;
        //int max;
        for(int k = 0; k<intArray4.length-1;k++) {
        if (intArray4[k] > intArray4[k+1]){
            //intArray4[k] = max;
            System.out.println("Максимальное значение" + " " + intArray4[k]);
        }else if(intArray4[k] < intArray4[k+1]){
           // intArray4[k] = min;
            System.out.println("Минимальное значение" + " " + intArray4[k]);
        }



        }


    }


}

