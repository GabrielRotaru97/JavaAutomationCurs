package JavaSoloLearn;

public class JavaSoloLearn {
    public static void main(String[] args) {
//        System.out.println("Printeaza ceva");

        primaMetoda();
        douaMetoda(8.5);
        System.out.println(treiaMetoda(4));

     int a = 5;
     int b = 7;
     System.out.println(a<b);
     System.out.println(b<a);

     boolean var =(7==6) && (7==7);
        System.out.println(var);

        }
     static void primaMetoda() {
        System.out.println("Prima mea metoda");
    }
    static void douaMetoda(double dublu){
        double rezultat = dublu * 2;
        System.out.println(rezultat);
    }
    static int treiaMetoda(int intreg){
        int rezultat = intreg*intreg;
        return rezultat;
    }
}
