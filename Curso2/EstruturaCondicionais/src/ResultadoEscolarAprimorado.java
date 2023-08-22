public class ResultadoEscolarAprimorado {

    public static void main (String [] args){

        Integer nota = 2;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }
    }

}
