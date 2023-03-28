package LearningForTest;
//6) Java program to display all integers within the range 100-150 whose sum of digits is an even number
public class RangeNumbers {
    public static void main(String[] args) {
        RangeNumbers obj= new RangeNumbers();
        obj.suma();
    }

    public void suma(){
        for (int i=100; i <=150; i++) {
            int sum =0;
            int num = i;
            while (num!=0){
                sum +=sum%10;
                num=num/10;
            }
            if (sum%2==0){
                System.out.println("Numarul par este :" + i);
            }
    }
}
}
