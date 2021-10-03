package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длину a первого катета: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("Это не число, попробуй еще раз: ");
            }
            a = scanner.nextDouble();
            if (a>0)
            {
                break;
            }
            else
            {
                System.out.print("Это число не положительное, попробуй еще раз: ");
            }
        } while (true);

        System.out.print("Введи длину b второго катета: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("Это не число, попробуй еще раз: ");
            }
            b = scanner.nextDouble();
            if (b>0)
            {
                break;
            }
            else
            {
                System.out.print("Это число не положительное, попробуй еще раз: ");
            }
        } while (true);

        c = Math.sqrt(a*a+b*b);

        double perimeter = a+b+c;
        double square = (a+b)/2;
        System.out.println("Периметр = " + perimeter);
        System.out.println("Площадь = " + square);
    }
}
