package Collections;

import Utils.Utils;


//How to convert string to float
    public class StrToFloat {
    public static void main(String[] args) {
        System.out.println("Introdu de la tastatura");
        StrToFloat obj= new StrToFloat();
        System.out.println(obj.convert(Utils.scanner().next()));

    }
    public float convert(String  value){
        float cifre = Float.parseFloat(value);
            return cifre;

    }
}
