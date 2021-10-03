package com.epam.jwd35.lesson2;

import java.util.Random;

public class task09 {

    public static void main(String[] args) {

        int firstArrSize = 15, secondArrSize = 5;
        int k = 5;
        int[] A = new int[firstArrSize];
        int[] B = new int[secondArrSize];
        Random rand = new Random();
        System.out.println("Массив A : ");
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }

        System.out.println("\nМассив B : ");
        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(100);
            System.out.print(B[i] + " ");
        }

        int[] res = new int[firstArrSize + secondArrSize];
        System.out.println("\nРезультат : ");
        int i;
        for (i = 0; i <= k; i++) {
            res[i] = A[i];
            System.out.print(res[i] + " ");
        }
        for (int j = 0; j < secondArrSize; i++, j++) {
            res[i] = B[j];
            System.out.print(res[i] + " ");
        }
        for (int j = k + 1; j < firstArrSize; j++) {
            res[i] = A[j];
            System.out.print(res[i] + " ");
        }
    }
}
