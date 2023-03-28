package JavaBasicPart2;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti un numar de la tastatura: ");
        double value = scanner.nextDouble();

        System.out.println(fahrenheitCelsius(value));

        reverse(5, 7);
        reverse1( 5, 7);
    }

    public static double fahrenheitCelsius(double fahr){
       return (fahr- 32) *5/9;
    }

 public static void reverse(double a, double b){
        a = a + b;  //a=13+8=21
        b = a - b;  //b=21-8=13
        a = a - b;  //a=21-13=8
     System.out.println("a= "+a+"---"+"b=  "+b);
    }

    public static void reverse1(double a, double b)
    {
        double temp = a;
        a=b;
        b=temp;
        System.out.println("a= "+a+"---"+"b=  "+b);

    }
}
