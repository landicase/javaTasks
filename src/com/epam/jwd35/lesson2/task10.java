package com.epam.jwd35.lesson2;

public class task10 {

    public static void main(String[] args) {
        int n = 6;
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array[j].length - j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" "+ array[i][j]);
            }
            System.out.println();
        }
    }
}