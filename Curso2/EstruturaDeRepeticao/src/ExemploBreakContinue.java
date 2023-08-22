public class ExemploBreakContinue {
    public static void main(String[] args) {
        Integer numero = 1;
        System.out.println("Exemplo Break");
        for(numero = 1;numero <= 5;numero++){
            if(numero == 3){
                break;
            }
            System.out.println(numero);
        }
        System.out.println("Exemplo Continue");

        for(numero = 1;numero <= 5; numero++){
            if(numero == 3){
                continue;
            }
            System.out.println(numero);
        }
    }
}
