package ru.vsu.cs.novichikhin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус основания циллиндра R = ");
        double r = in.nextDouble();
        System.out.print("Введите высоту циллиндра Н = ");
        double h = in.nextDouble();
        double v = Math.PI*r*r*h;
        System.out.printf("Для цилиндра с основанием радиуса R = %1$.3f и высотой H = %2$.3f объём V = %3$.3f%n",
                r ,h ,v);
    }
}

