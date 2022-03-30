public class Nota{
    private String nome_aluno;
    private String nome_disciplina;
    public double[] notas = new double[2];

    public Nota(String nome, String disc,double nota_semestre1,double nota_semestre2){
        this.nome_aluno = nome;
        this.nome_disciplina = disc;
        this.notas[0]=nota_semestre1;
        this.notas[1]=nota_semestre2;
    }

}
