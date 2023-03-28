package JavaBasicPart2;

import Utils.Utils;

public class ReverseString {
    public static void main(String[] args) {
    ReverseString reversed = new ReverseString();
        System.out.println(reversed.reverse(Utils.scanner().next()));
    }

    public String reverse(String string){

        char[] elementChar = string.toCharArray();
        char[] reversedVal = new char[string.length()];
        int j = 0;
        for (int i = string.length() - 1; i >=0; i--) {
            reversedVal[j++]= elementChar[i];
        }
        return String.valueOf(reversedVal);
    }
}
