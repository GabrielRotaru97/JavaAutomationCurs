package JavaBasicPart1;

public class Run {
    public static double inmultire(double nr1, double nr2) {
        double rezultat = nr1 * nr2;
        return rezultat;
    }

    public static double adaugare(double numar1, double nr2) {
        double rezultat = numar1 + nr2;
        return rezultat;
    }

    public static double scadere(double numar1, double numar2) {
        double rezultat = adaugare (numar1,numar2) - numar2;
        return rezultat;
    }

    public static double impartire(double numar1, double numar2) {
        return numar1 / numar2;
    }

    public static int modul(int numar1, Integer numar2) {
        return numar1 & numar2;
    }

    public static double genereazaNumarRandom(double minim, double maxim) {
        return Math.random() * (maxim - minim) + minim;
    }

}