package questao4;

/*
Faça um algoritmo em Java para calcular as notas finais de um aluno. 
O usuário irá informar o nome do aluno, o nome da disciplina e a quantidade de notas para cada semestre (2 semestre). 
Crie um laço de repetição para cada semestre com a quantidade de notas, e leia cada nota. 
Escreva o nome do aluno, o nome da disciplina, a média (aritmética) de cada semestre e a nota final. 
Se a nota final for maior ou igual a 6, escreva “aprovado”, senão “reprovado”.
*/

import java.util.Scanner;

/**
 *
 * @author 6962246
 */



public class questao4 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nota[] notas = new Nota[6];

        for(int i=0;i<6;i++){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe nome do aluno: ");
        String nome = scanner.next();

        System.out.println("Informe nome da disciplina: ");
        String nome_disciplina = scanner.next();

        System.out.println("Informe a nota para a disciplina: ");
        double nota_disciplina = scanner.nextDouble();

        Nota nota = new Nota(nome,nome_disciplina,nota_disciplina);

        notas[i]=nota;
        }
 
        System.out.println("Média Final: ");
        
    }


}

