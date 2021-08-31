package ru.geekbrains.lesson2;

public class Classwork2 {
    public static void main(String[] args) {
        int choice = 1;



        int a1 = 15;
        int a2 = 48;
        int a3 = 512;
        int a4 = 33;
        int a5 = 111;
        int a6 = -200;
        int a7 = 90;
        int a8 = 256;

        int[] intArray = new int[8];  //формирование массива из данных
        // int arr[]; C style
        intArray[0] = a1;
        intArray[1] = a2;
        intArray[2] = a3;
        // intArray[3] = a4;
        intArray[4] = a5;
        intArray[5] = a6;
        intArray[6] = a7;
        intArray[7] = a8;
        //intArray[8] = a1;

        System.out.println(intArray[4]);
        intArray[0] = intArray[5] + intArray[7];
        System.out.println(intArray[0]);
        System.out.println(intArray[3]);

        String s1 = "Hello";
        String s2 = "world";
        String s3 = "dgdf";
        String s4 = "Roma";

        String[] strings = new String[4];
        strings[0] = "Hello ";
        strings[1] = "world";
        strings[2] = " !";
        strings[3] = "";


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
        System.out.println();


        for (int i = intArray.length - 1; i >= 0; i--) {  // в обр порядке
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = intArray.length - 1; i >= 0; i-=3) {  // в обр порядке
            System.out.print(intArray[i] + " ");
        }


    }
}

