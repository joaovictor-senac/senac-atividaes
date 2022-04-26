public class Aluno {
    String nome;
    int nota;

    public Aluno(String nome,int nota){
        this.nota = nota;
        this.nome = nome;
    }

    public void validarNota(){
        System.out.println("voce foi aprovado");
    }

}
