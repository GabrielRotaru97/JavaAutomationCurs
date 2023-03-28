package JavaBasicPart3;
//Media aritmetica a 3 numere este 14.
//Primul este cu 7 mai mare decat al doilea si al treilea este de 3 ori mai mare decat al doilea.
//a+b+c  = 14

public class MediaAritmetica {
        private int a;
        private int b;
        private int c;

    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }

    public void mediaAritmetica(){
//        media aritmetica este >5 sa avem un mesaj
//        media aritmetica este >10 alt mesaj
//        media aritmetica este<3 , valoarea mediei artimetice /5;
       int mediaAritmetica = (a+b+c)/3;
       if(mediaAritmetica>5 && mediaAritmetica<10){
           System.out.println("Media aritmetica este mai mare decat 5");
       }else if(mediaAritmetica>10){
           System.out.println("Media aritmetica este mai mare ca 10");

           } else if (mediaAritmetica<3) {
           System.out.println("Valoare media aritmetica/1.5 = "+(mediaAritmetica/1.5));

       }else{
           System.out.println("Valori inafara conditiilor");

    }

    }

}


