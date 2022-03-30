/*Faça um algoritmo em Java para determinar o gasto de em uma viagem de carro. 
O usuário irá informar a distância total da viagem, o valor do litro do combustível, 
o consumo médio do veículo (KM/L), e o valor total dos pedágios. Escreva o gasto total.
*/

import java.util.Scanner;
/**
 *
 * @author 6962246
 */
public class questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe distância total da viagem: ");
        double valor_distancia = scanner.nextInt();

        System.out.println("Informe o valor do litro do combustível: ");
        double valor_litro = scanner.nextInt();

        System.out.println("Informe o consumo medio do veículo(KM/L): ");
        double valor_consumo = scanner.nextInt();

        //120 km
        //10km/l
        //7


        //120/10==qnt litros
        //qnt*7=valor gasto
        double valor_final=0, quantidade_litros=0;
        quantidade_litros = valor_distancia/valor_consumo;
        valor_final = quantidade_litros*valor_litro;

        System.out.println("Informe o valor total dos pedágios: ");
        double valor_pedagios = scanner.nextInt();

        valor_final = valor_final + valor_pedagios;
        
        System.out.println("Gasto Final: "+valor_final);
        
    }
    
}
