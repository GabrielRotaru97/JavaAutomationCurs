package JavaBasicPart3;

public class Runner {
    public static void main(String[] args) {
        MediaAritmetica valoare= new MediaAritmetica();
        valoare.setA(12);
        valoare.setB(12);
        valoare.setC(12);
        valoare.mediaAritmetica();

        WaterTank object2 = new WaterTank();
        double a = object2.transform("0.3 m");
        double b = object2.transform("17 dm");
        double c = object2.transform("200 cm");


        object2.setLungime(a);
        object2.setLatime(b);
        object2.setInaltime(c);

        System.out.println(object2.numberOfBottles());

    }
}
