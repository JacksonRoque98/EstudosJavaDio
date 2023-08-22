public class PlanoOperadora {
    public static void main(String[] args) {
        //Planos B = Básico / M = Medio / T = Turbo
        String plano = "T";

        switch (plano){
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M":{
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
                break;
            }
            case "T":{
                System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5Gb de YouTube");
                break;
            }
            default:
                System.out.println("Plano Inexistente!");
        }
    }
}
