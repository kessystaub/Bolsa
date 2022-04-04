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
public class NovaPessoa {
    
            /**
     * @param args the command line arguments
     */
    private String nome;
    private String cpf;
    private int idade;
    private int codigo;

    
    public NovaPessoa(String nome, String cpf, int idade, int codigo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
