package Collections;

import Utils.Utils;

//How to convert string to integer in java
//program
public class StrToInteger {
    public static void main(String[] args) {
        System.out.println("Introdu de la tastatura");
        StrToInteger obj1 = new StrToInteger();
        System.out.println(obj1.convertire(Utils.scanner().next()));
        System.out.println("Introdu de la tastatura");
        System.out.println(obj1.conversie(Utils.scanner().nextInt()));
    }

    public int convertire(String value){
        int number = Integer.parseInt(value);
        return number;
    }

    public String conversie(int value){
        switch (value){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Numar inafara limitelor";


        }

    }
}

