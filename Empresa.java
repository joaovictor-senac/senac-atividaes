public class Empresa implements ProdutoInterfase {
    private String nome;
    private String cpnj;
    private String inscricaoCaoEstadual;
    private int dataAbertura;
    private String email;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getInscricaoCaoEstadual() {
        return inscricaoCaoEstadual;
    }

    public void setInscricaoCaoEstadual(String inscricaoCaoEstadual) {
        this.inscricaoCaoEstadual = inscricaoCaoEstadual;
    }

    public int getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(int dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidaade() {
        return cidade;
    }

    public void setCidaade(String cidaade) {
        this.cidade = cidaade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
     public void BuscarProduto() {

    }

    @Override
     public void BuscarNomeEmpresa(){

    }

}
