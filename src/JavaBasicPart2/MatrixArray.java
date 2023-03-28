package JavaBasicPart2;

public class MatrixArray {
    public static void main(String[] args) {

        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        MatrixArray obj1 = new MatrixArray();
        obj1.metoda1(charArray);
        obj1.metoda2(charArray);
    }
    public void metoda1(char[] args){
        for (int i = 0; i < args.length; i += 2) { // i = i+2;
            if (i%2 == 0){
                System.out.print(args[i]);
            }
        }
    }

    public void metoda2(char[] args){
        for (int i = 0; i < args.length; i++) {
            if (i%2 == 0){
                System.out.print(args[i]);
            }
        }

    }
}

