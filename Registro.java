public class Registro extends Abstract_Pessoa {
// Dados da pessoa
    private String nome;
    private String rg;
    private String cpf;
    private String dataDenaCimento;
    private String signo;
    private String genero;
    private String religiao;

    private int altura;
    private Double peso;









    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataDenaCimento() {
        return dataDenaCimento;
    }

    public void setDataDenaCimento(String dataDenaCimento) {
        this.dataDenaCimento = dataDenaCimento;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String sexo) {
        this.genero = sexo;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}

