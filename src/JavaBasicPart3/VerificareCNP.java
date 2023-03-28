package JavaBasicPart3;

public class VerificareCNP {
    final int[]constanta={2,7,9,1,4,6,3,5,8,2,7,9};
    public void verificareCnp(String cnp){
        if (cnp.length() !=13){
            System.out.println("cnp este invalid");
        }
        int sume=0;
        for (int i = 0; i <12 ; i++) {

            sume=sume+(Integer.parseInt(String.valueOf(cnp.charAt(i)))* constanta[i]);

        }
        int cifracontrol=0;
        if (sume%11==10){
            cifracontrol=1;

        }else if (sume%11<10){
            cifracontrol=sume%11;
        }
        if (cifracontrol!=Integer.parseInt(String.valueOf(cnp.charAt(12)))){
            System.out.println("cnp este invalid");
        }else {
            System.out.println("cnp este valid");
        }
    }
}
