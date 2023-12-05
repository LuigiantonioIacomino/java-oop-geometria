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
            if(i==Base-1) {
                System.out.println("0");
            }
            else {
                System.out.print("0");
            }
        }
        for (int j = 0; j <Altezza; j++) {
            for (int i = 0; i < Base; i++) {
                if (i == 0) {
                    System.out.print("0");
                } else if (i == Base - 1) {
                    System.out.println("0");
                } else {
                    System.out.print(" ");
                }
            }
        }

        for (int i = 0; i < Base; i++) {
            System.out.print("0");
        }


    }
}
