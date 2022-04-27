public class Professor extends Aluno {
     String nome;
     int notaDoAluno;
     int idade;
     Aluno aluno;



    public Professor(String nome, int notaDoAluno, int idade) {
        super(nome, notaDoAluno);
        this.nome = nome;
        this.notaDoAluno = nota;
        this.idade = idade;

    }

    public void CalcularNota() {
        int resultado = notaDoAluno / 3;
        System.out.println(resultado);
        aluno.validarNota();
    }

}
