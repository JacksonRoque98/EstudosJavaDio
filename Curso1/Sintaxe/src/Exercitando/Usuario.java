package Exercitando;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada ? " + smartTv.ligada);
        System.out.println("Qual canal a Tv está : " + smartTv.canal);
        System.out.println("Qual volume a Tv está : " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo Status da Tv : " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Novo Status da Tv : " + smartTv.ligada);

        smartTv.mudarCanalPara(13);
        System.out.println("Canal da Tv atual : " + smartTv.canal);

    }

}
