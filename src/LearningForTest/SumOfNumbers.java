package LearningForTest;

import Utils.Utils;

// 3) se da un numar de la tastatura cuprins intre 1000 si 9999.
// Calculati suma numerelor de pe index ul 1 si index ul 3.
public class SumOfNumbers {
    public static void main(String[] args) {
    SumOfNumbers object= new SumOfNumbers();
        System.out.println(object.numbers(Utils.scanner().nextInt()));
    }
    public String numbers(int number){
        int index1=(number/100)%10;
        int index3=number%10;
        int sum=index1+index3;
        return String.valueOf(sum);

    }
}
