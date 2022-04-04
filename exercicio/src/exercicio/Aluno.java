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
public class Aluno extends NovaPessoa{
    private String curso;
    private int periodo;

    public Aluno(String nome, String cpf, int idade, int codigo,String curso, int periodo) {
        super(nome,cpf,idade,codigo);
        this.curso = curso;
        this.periodo = periodo;
    }

  
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
}
