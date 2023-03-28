package JavaBasicPart2;

import Utils.Utils;

import java.util.Scanner;

public class TwoFer {
    public static void main(String[] args) {
        String Value = null;
        TwoFer obj = new TwoFer();
        String input = Utils.scanner().nextLine();
        obj.names("");
    }

    public void names(String name) {
        if (name.isEmpty()) {
            System.out.println("One for you, one for me");
        } else {
            System.out.println("One for " +name+ ", one for me.");


        }
    }

}
