package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task06 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        b = scanner.nextDouble();
        System.out.print("Введите число c: ");
        c = scanner.nextDouble();
        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));
        double sum = min + max;
        System.out.println("Сумма большего и меньшего из трех числел равна: "+sum);
    }
}

