import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = scan.next();

        System.out.println("Digite sua idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura, precisam ser numericos!");
        }

    }

}
