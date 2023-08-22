public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Jackson", "Juan", "Paulo", "Diego", "Vito", "Jose"};
        for(int x=0; x< alunos.length; x++){
            System.out.println("O aluno do indice "+(x+1)+" é :"+alunos[x]);
        }

        //FOR EACH ESTÁ FORTEMENTE USADO COM ARREYS

        for(String aluno : alunos){
            System.out.println("O nome do aluno é: "+aluno);
        }
    }
}
