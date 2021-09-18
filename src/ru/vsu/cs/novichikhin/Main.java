package ru.vsu.cs.novichikhin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double r = readValue("радиус основания цилиндра R = ");
        chekValue(r);
        double h = readValue("высоту H = ");
        chekValue(h);
        double v = calculateVolume(r, h);
        printVolume(r, h, v);
    }

    static double readValue(String value) {
        System.out.print("Введите " + value);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    static void chekValue(double val) {
        if (val <= 0) {
            System.out.print("Данные введены неверно.");
            System.exit(0);
        }

    }

    static double calculateVolume(double r, double h) {
        double v = Math.PI * r * r * h;
        return v;
    }

    static void printVolume(double r, double h, double v) {
        System.out.printf("Для цилиндра с основанием радиуса R = %1$.3f и высотой H = %2$.3f объём V = %3$.3f%n",
                r, h, v);
    }
}

    


