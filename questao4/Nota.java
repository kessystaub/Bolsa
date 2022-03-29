package questao4;

public class Nota{
    private String nome_aluno;
    private String nome_disciplina;
    private double nota_alcancada;

    public Nota(String nome, String disc, double nota){
        this.nome_aluno = nome;
        this.nome_disciplina = disc;
        this.nota_alcancada = nota;
    }
}