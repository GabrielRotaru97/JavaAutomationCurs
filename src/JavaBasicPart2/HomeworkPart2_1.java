package JavaBasicPart2;

import Utils.Utils;

public class HomeworkPart2_1 {
    public static void main(String[] args) {
        HomeworkPart2_1 Obj1 = new HomeworkPart2_1();
        Obj1.compareNumber(100);
//          Obj1.compareNumberVersion1(100);
    }

    public void compareNumber (int i){
        System.out.println("Adauga numarul: ");
        int a = Utils.scanner().nextInt();
        int b = Utils.randomNumber(i);
        if (a<b){
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul random este mai mare decat "+ a + " < " + b);
        } else {
            System.out.println(Utils.randomNumber(i));
            System.out.println("Numarul citit de la tastatura este mai mare decat numarul random "+ a + " > " + b);
        }
    }
    public void compareNumberVersion1 (int i){
        System.out.println("Adauga numarul");
        int a = Utils.scanner().nextInt();

        if (a<Utils.randomNumber(i)){
            System.out.println("Numarul random este mai mare decat "+ a + " < " + Utils.randomNumber(i));
        } else {
            System.out.println("Numarul citit de la tastatura este mai mare decat numarul random "+ a + " > " + Utils.randomNumber(i));
        }
    }

}
