public class ControleFluxo {

    public static void main (String [] args){

        double saldo = 15.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Seu novo saldo é: R$"+saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

}
