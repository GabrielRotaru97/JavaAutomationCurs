//package JavaBasicPart1;

import JavaBasicPart1.Run;

public class Variables {
    public static void main(String[] args) {
        System.out.println(divide((int) 30.25, (int) 15.75));
        System.out.println(Run.adaugare(2,3)+"--"+Run.inmultire(2,3)+"--"+Run.impartire(3,4)+"--"+Run.scadere(4,5)+"--"+Run.modul(5,6)+"--"+Run.genereazaNumarRandom(8,5));
    }
    public static double divide(int a, int b) {
        int c = (int) (a / b);
        return c;
    }
}