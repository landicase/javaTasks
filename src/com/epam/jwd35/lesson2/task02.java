package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи действительное число a: ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("Это не действительное число, попробуй еще раз: ");
        }
        a = scanner.nextDouble();
        System.out.print("Введи действительное число b: ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("Это не действительное число, попробуй еще раз: ");
        }
        b = scanner.nextDouble();
        System.out.print("Введи действительное число c ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("Это не действительное число, попробуй еще раз: ");
        }
        c = scanner.nextDouble();

        double res = (b+Math.sqrt(Math.pow(b,2)+4*a*c)/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Результат = " + res);
    }
}
