public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("01234-111");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 9){
            throw new CepInvalidoException();
        }

        //simulando um cep formatado
        return cep;
    }

}
