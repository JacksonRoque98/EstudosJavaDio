package Operators;

import java.util.Date;

public class Operators {
    //Operador de atribuição =
    String name = "Jackson";
    Integer number = 123;
    double peso = 22.3;
    char sexo = 'M';
    boolean verdadeiroOuFalso = true;
    boolean falsoOuVerdadeiro = false;
    Date dataDeNascimento = new Date();
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    //Operadores aritimeticos + - * / %
    Integer soma = 1 + 2;
    double subtracao = 1 - 2;
    Integer multiplicacao = 2 * 2;
    double divisao = 4 / 2;
    Integer modulo = 18 % 3;
    double resultado = (10*3) + (20/4);

    //Operador + usado em texto faz a concatenação das Strings!
    Integer number1 = 1;
    String name1 = "Jack";
    String concatenacao = number1 + name1; //1Jack

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    //Operadores unarios

    //(+) = converte o numero para positivo
    //(-) = converte o numero para negativo
    //(++) = incrementa o valor em 1 unidade
    //(--) = decrementa o valor em 1 unidade
    //(!) = nega a expressão booleana : True vira False / False vira True

    //Operadores Ternário
    //Operador ternário seria um If/else em uma linha! <expressão condicional> ? <caso experssão seja true> : <caso condição seja false>

    Integer a = 5;
    Integer b = 6;

    String result = a == b ? "verdadeiro" : "False";
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Operadores Relacionais
    //(==) quando desejamos verificar se uma variavel é igual a outra
    //(!=) quando desejamos verificar se uma variavel é diferente da outra
    //(>) quando desejamos verificar se uma variavel é maior que a outra
    //(>=) quando desejamos verificar se uma variavel é maior ou igual a outra
    //(<) quando desejamos verificar se uma variavel é menor que a outra
    //(<=) quando desejamos verificar se uma variavel é menor ou igual a outra
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    //Operadores logicos
    //(&&) = E
    //(||) = OU



}
