package LearningForTest;

import Utils.Utils;

//7) bis :  Java Program to Check Whether the Generated Random Number Is Even or Odd
// intre 1 si 99.000
public class WhetherOddOrEven {
    public static void main(String[] args) {
        WhetherOddOrEven object= new WhetherOddOrEven();
        object.oddOReven(Utils.randomNumber(99000));
    }
    public void oddOReven(int number){
        if(number%2==0){
            System.out.println(number + " Is Even");
        }else{
            System.out.println(number + " Number is odd");
        }

    }

     }


