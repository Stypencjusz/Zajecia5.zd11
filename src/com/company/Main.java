package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double Cyfra,lp=0;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        Cyfra = odczyt.nextInt();
        for (int i = 1; i <= Cyfra; i++) {
            if ((Cyfra % i) == 0) {
                System.out.println(" " + i);
                lp++;
            }
        }
        if (lp==2)
            System.out.println(" Liczba " + Cyfra +" jest pierwsza");
    }
}
