/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import poo.Veiculo;

/**
 *

 * @author 6962246
 */
public class TestaVeiculo {
     public static void main(String[] args) {
     
        //Veiculo fiat = new Veiculo("uno","vermelho",1999);
        //Veiculo toyota = new Veiculo("corolla","branco",2000);
     
        Veiculo fiat = new Veiculo();
        fiat.setModelo("uno");
        fiat.setCor("vermeio");
        fiat.setAno(1999);
        
        Veiculo toyota = new Veiculo();
        toyota.setModelo("corolla");
        toyota.setCor("branco");
        toyota.setAno(2000);
        
        
        fiat.exibe();
        toyota.exibe();
     
     }
}
