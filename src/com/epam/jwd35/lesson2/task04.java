package com.epam.jwd35.lesson2;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.print("Введите координату x: ");
        int x = readInt();
        System.out.print("Введите координату y: ");
        int y = readInt();
        printResult(ifInside(x, y));
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        return a;
    }

    public static boolean ifInside(int x, int y) {
        return (x <= 2) && (x >= -2) && (y <= 4) && (y >= 0) || (x <= 4) && (x >= -4) && (y <= 0) && (y >= -3);
    }

    public static void printResult(boolean ifInside) {
        if (ifInside) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}