package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double Cyfra;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        Cyfra = odczyt.nextInt();
        for (int i = 1; i <= Cyfra; i++) {
            if ((Cyfra % i) == 0)
                System.out.println(" " + i);
        }
    }
}
