package org.lessons.java.geometria;

public class Rettangolo {
    int base;
    int altezza;

    Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    int calcolaArea () {
        int Area=base*altezza;
        return Area;
    }

    int calcolaPerimetro() {
        int perimetro=(2*base)+(2*altezza);
        return perimetro;
    }
}
