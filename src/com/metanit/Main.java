package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements (possible values are only 1 and 0):");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.print("Your initial array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }

        for (int i=0; i < size; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        System.out.print(", Your transformed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        //System.out.println();
    }
}