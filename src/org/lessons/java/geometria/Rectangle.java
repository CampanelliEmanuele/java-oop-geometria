package org.lessons.java.geometria;

/**
 * Nel progetto java-oop-geometria creare un package org.lessons.java.geometria in cui inserire le classi:
 * 1. una classe Rettangolo con due attributi interi: base e altezza.
 *      Aggiungere un opportuno costruttore con parametri.
 *      Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il
 *      perimetro del rettangolo.
 * 2. una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da terminale, i valori di
 *      base e di altezza con cui creare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
 * BONUS
 * Aggiungere alla classe Rettangolo un metodo “disegna” che disegna in console il rettangolo con le sue dimensioni,
 * come nell’immagine allegata
 */

public class Rectangle {

    double base, height;

    public Rectangle(double base, double height) {
        this.base = base >= 0 ? base : 0.0d;
        this.height = height >= 0 ? height : 0.0d;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return base * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

}