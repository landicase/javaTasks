package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task05 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        c = scanner.nextDouble();
        double[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            int coeff;
            if (array[i] >= 0) {
                coeff = 2;
            } else {
                coeff = 4;
            }
            System.out.println(Math.pow(array[i], coeff));
        }
    }
}


