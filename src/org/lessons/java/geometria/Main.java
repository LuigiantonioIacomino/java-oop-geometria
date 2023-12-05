package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci base: ");
        int Base=scan.nextInt();
        System.out.println("Inserisci altezza: ");
        int Altezza=scan.nextInt();
        Rettangolo rect=new Rettangolo(Base,Altezza);
        int areaCalcolata=rect.calcolaArea();
        int perimetroCalcolato=rect.calcolaPerimetro();
        System.out.println(areaCalcolata);
        System.out.println(perimetroCalcolato);
        for (int i = 0; i < Base; i++) {
            System.out.print("0");
        }
        for (int i = 0; i < Altezza; i++) {
            System.out.println();
        }

    }
}
