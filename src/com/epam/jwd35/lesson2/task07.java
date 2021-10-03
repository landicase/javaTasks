package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task07 {

    public static void main(String[] args) {
        double a, b, h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите левую границу отрезка: ");
        a = scanner.nextDouble();
        System.out.print("Введите правую границу отрезка: ");
        b = scanner.nextDouble();
        System.out.print("Введите шаг: ");
        h = scanner.nextDouble();
        System.out.println("x" + "\t" + "F(x)");
        for (double i=a;i<=b;i+=h) {
            double fx = Math.pow(Math.sin(i),2) - Math.cos(2*i);
            System.out.println(i + "\t" + fx);
        }
    }
}

