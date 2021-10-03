package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырехзначное число: ");
        do {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Это не число, попробуйте еще раз: ");
            }
            number = scanner.nextInt();
            if (number >= 1000 && number <= 9999) {
                break;
            } else {
                System.out.print("Это число не является четырехзначным, попробуйте еще раз: ");
            }
        } while (true);
        if (number / 1000 + (number % 1000 / 100) == (number % 100 /10) + number % 10) {
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
