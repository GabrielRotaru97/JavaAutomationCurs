package LearningForTest;

import Utils.Utils;

//4) Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//153 = (111)+(555)+(333)
//where:
//(111)=1
//(555)=125
//(333)=27
//So:
//1+125+27=153
public class ArmstrongNumber {
    public static void main(String[] args) {
    ArmstrongNumber object=new ArmstrongNumber();
        System.out.println(object.isArmstrong(Utils.scanner().nextInt()));
    }
    public boolean isArmstrong(int number) {

        int sum = 0;
        int original = number;
        int digits = String.valueOf(number).length();
        while (number >0){
            int digit=number%10;
            sum +=Math.pow(digit, digits);
            number/=10;
        }
        return sum==original? true:false;

    }
}
