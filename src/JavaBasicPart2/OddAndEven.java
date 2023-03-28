package JavaBasicPart2;

public class OddAndEven {

    public static void main(String[] args) {
        System.out.println("introduceti un numar de la tastatura");
        oddandeven(Utils.Utils.scanner().nextInt());

    }
    public static void oddandeven(int a){
        if(a%2==0) {
            System.out.println("numerele sunt pare");

        }else{
            System.out.println("numarul este impar");
        }
    }

}
