/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author 6962246
 */
public class questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite os graus: ");
        double valor = scanner.nextInt();
        
        //(0 °C × 9/5) + 32 = 32 °F
        
        valor = valor*(1.8);
        valor = valor+32;
       
        
        System.out.println("Valor em fahrenheit: "+valor);
        
    }
    
}
