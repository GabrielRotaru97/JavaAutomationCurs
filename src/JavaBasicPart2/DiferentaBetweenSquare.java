package JavaBasicPart2;

import Utils.Utils;

public class DiferentaBetweenSquare {
    public static void main(String[] args) {
        DiferentaBetweenSquare diferenta = new DiferentaBetweenSquare();
        System.out.println(diferenta.difBSumAndSquare(Utils.scanner().nextInt()));
    }
    public int squareOfSum(int n){
        //calculam patratele primelor n numere naturale
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum = sum + i;
        }
        return (int) Math.pow(sum, 2);
    }
    public int sumofSquare(int n){
        //
        int sum = 0;
        for(int i = 1;i <=n;i++){
            sum = (int) (sum + Math.pow(i,2));
        }
        return sum;
    }
    public int difBSumAndSquare(int n){
        return squareOfSum(n) - sumofSquare(n);
    }
}
