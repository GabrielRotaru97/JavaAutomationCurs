package JavaSoloLearn;

import java.util.Scanner;

public class JavaSoloExercises {

    public static void main(String[] args) {
        System.out.println("introduceti un numar de la tastatura");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        double nr1 = scanner.nextDouble();

        System.out.println("introduceti al doilea numar de la tastatura");
        double nr2 = scanner.nextDouble();

        double rezultatInmultire = inmultire( nr1, nr2);
        System.out.println(impartire( nr1, nr2));

        System.out.println("Rezultatul inmultirii este: " + rezultatInmultire);

        double random = genereazaNumarRandom(rezultatInmultire, impartire(nr1,nr2));
        System.out.println("Numarul random generat intre " +  rezultatInmultire + " si " + impartire(nr1 , nr2) + " este: " + random) ;
    }
    public static double inmultire(double nr1, double nr2){
        double rezultat = nr1 * nr2;
        return rezultat;
    }
    public static double impartire(double nr1, double nr2){
        double rezultat = nr1 / nr2;
        return rezultat;
    }
    public static double genereazaNumarRandom(double minim, double maxim){
        return Math.random()*(maxim-minim) + minim;
    }
}
