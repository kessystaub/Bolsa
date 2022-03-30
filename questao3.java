/*
Faça um algoritmo em Java para determinar o salário de um vendedor. 
O usuário irá informar o nome do vendedor, o salário fixo e a quantidade de vendas realizadas. 
Crie um laço de repetição com a quantidade de vendas realizadas, e leia o valor total para cada venda.
 Sabendo que o vendedor ganha 15% de comissão sobre as vendas efetuadas, escreva o nome do vendedor, o salário fixo e o salário final com as comissões.
*/

import java.util.Scanner;
/**
 *
 * @author 6962246
 */
public class questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe nome do vendedor: ");
        String nome = scanner.next();

        System.out.println("Informe o salario fixo: ");
        double salario = scanner.nextDouble();

        System.out.println("Informe a quantidade vendas: ");
        double vendas = scanner.nextDouble();

        for(int i=0;i<vendas;i++){
            System.out.println("Informe o valor da venda "+i+" :");
            double valor_venda = scanner.nextDouble();

            total = total + valor_venda;
        }

        total = (total*15)/100;
        total = total+salario;

        System.out.println("Nome do vendedor: "+nome);
        System.out.println("Salario Fixo: "+salario);
        System.out.println("Salario Final com comissões: "+total);

        
    }
    
}
