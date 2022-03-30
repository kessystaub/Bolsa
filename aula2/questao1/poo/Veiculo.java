/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author 6962246
 */
public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
       
    public Veiculo(){
    }
    
    /*
    public Veiculo(String mod, String cor, int ano){
        this.modelo = mod;
        this.cor = cor;
        this.ano = ano;
    }
    */
    
    public void exibe(){
        System.out.println("Veiculo: "+getModelo()+" "+getCor()+" "+getAno());
    }
    
    public void setModelo(String mod){
        this.modelo = mod;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getAno(){
        return this.ano;
    }
    
}
