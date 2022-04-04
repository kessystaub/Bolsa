/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author 6962246
 */
public class Funcionario extends NovaPessoa{
    private float salario;
    private String cargo;
    
    public Funcionario(String nome, String cpf, int idade, int codigo,float salario, String cargo){
        super(nome,cpf,idade,codigo);
        this.salario = salario;
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
