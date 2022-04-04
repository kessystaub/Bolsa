/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio;
import java.util.ArrayList;
/**
 *
 * @author 6962246
 */
public class Pessoa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno("joao","00130213",18,1294,"ciencia da computacao",3);
        Aluno aluno2 = new Aluno("maria","00130213",19,1294,"ciencia da computacao",2);
        Aluno aluno3 = new Aluno("jose","00130213",15,1294,"ciencia da computacao",3);
        Aluno aluno4 = new Aluno("augusto","00130213",17,1294,"ciencia da computacao",2);
        Aluno aluno5 = new Aluno("ellen","00130213",19,1294,"ciencia da computacao",3);
        Aluno aluno6 = new Aluno("cleber","00130213",29,1294,"ciencia da computacao",2);
        Aluno aluno7 = new Aluno("joaozinho","00130213",14,1294,"ciencia da computacao",3);
        Aluno aluno8 = new Aluno("mariazinha","00130213",19,1294,"ciencia da computacao",2);
        Aluno aluno9 = new Aluno("sara","00130213",23,1294,"ciencia da computacao",3);
        Aluno aluno10 = new Aluno("ana","00130213",20,1294,"ciencia da computacao",2);
        
        Funcionario funcionario1 = new Funcionario("eugenio","00130213",31,1294,1000, "gerente");
        Funcionario funcionario2 = new Funcionario("joao","00130213",19,1294,1000, "gerente");
        Funcionario funcionario3 = new Funcionario("joao","00130213",22,1294,1000, "gerente");
        Funcionario funcionario4 = new Funcionario("joao","00130213",23,1294,1000, "gerente");
        Funcionario funcionario5 = new Funcionario("joao","00130213",25,1294,1000, "gerente");
        Funcionario funcionario6 = new Funcionario("joao","00130213",19,1294,1000, "gerente");
        Funcionario funcionario7 = new Funcionario("felipe","00130213",30,1294,3000, "gerente");
        Funcionario funcionario8 = new Funcionario("joao","00130213",29,1294,1000, "gerente");
        Funcionario funcionario9 = new Funcionario("roberto","00130213",49,1294,1000, "gerente");
        Funcionario funcionario10 = new Funcionario("joao","00130213",29,1294,1000, "gerente");

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        funcionarios.add(funcionario6);
        funcionarios.add(funcionario7);
        funcionarios.add(funcionario8);
        funcionarios.add(funcionario9);
        funcionarios.add(funcionario10);
        
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);
        alunos.add(aluno8);
        alunos.add(aluno9);
        alunos.add(aluno10);

        //Selecionar os funcionários que recebem mais que 2000 e listar seus nomes   
        System.out.println("Funcionarios com salario maior que 2000: ");
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getSalario()>2000){
                System.out.println(funcionario.getNome());
            }
        }
        System.out.println("\n");
        
        //Selecionar os alunos que estão nos períodos ímpares e pares e listar seus nomes
        for(Aluno aluno: alunos){
            if(aluno.getPeriodo()%2==0){
                System.out.println("Aluno periodo par: "+aluno.getNome());
            }else{
                System.out.println("Aluno periodo impar: "+aluno.getNome());
            }
        }
        
        //Somar o salário de todos os funcionários
        int soma=0;
        for(Funcionario funcionario: funcionarios){
            soma += funcionario.getSalario();
        }
        System.out.println("\nSoma salarios: "+soma);
        
        //Listar os funcionários com mais de 30 anos
        System.out.println("\nFuncionarios com mais de 30 anos: ");
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getIdade()>30){
                System.out.println(funcionario.getNome());
            }
        }
        
        System.out.println("\n");
        
        //Listar o aluno mais novo e o mais velho
        int maiorIdade = 0, menorIdade = 100;
        Aluno maisvelho = new Aluno("","",0,0,"",0);
        Aluno maisnovo = new Aluno("","",0,0,"",0);
        for(Aluno aluno:alunos){
                if(aluno.getIdade() > maiorIdade){
                    maisvelho = aluno;
                    maiorIdade = aluno.getIdade();
                }
                if(aluno.getIdade() < menorIdade){
                    maisnovo = aluno;
                    menorIdade = aluno.getIdade();
                }
        }
        System.out.println("Aluno mais velho: "+maisvelho.getNome());
        System.out.println("Aluno mais novo: "+maisnovo.getNome());
        
        
        //Listar o funcionários que está mais próximo de se aposentar
        maiorIdade = 0;
        Funcionario velho = new Funcionario("","",0,0,0,"");
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getIdade() > maiorIdade){
                maiorIdade = funcionario.getIdade();
                velho = funcionario;
            }
        }
        System.out.println("\nFuncionario mais próximo da aposentadoria: "+velho.getNome());
        
        
        //Listar os alunos que sua idade é um número primo
        System.out.println("\nAlunos com a sua idade numero primo: ");
        for(Aluno aluno:alunos){
                if (aluno.getIdade() % 2 != 0 && aluno.getIdade() % 3 != 0){
                    System.out.println(aluno.getNome());
                }
        }
        

        //Calcular a média salarial dos funcionários
        System.out.println("\nMedia salarial dos funcionarios: "+soma/funcionarios.size());
    }
    
}
