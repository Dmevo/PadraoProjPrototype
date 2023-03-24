package militar;

public class Pessoa implements Cloneable{

    private String nome;
    private String dataNascimento;
    private String cpf;

    private Patente patente;

    public Pessoa(String nome, String dataNascimento, String cpf, Patente patente) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.patente = patente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoaClone = (Pessoa) super.clone();
        pessoaClone.patente = (Patente) pessoaClone.patente.clone();
        return pessoaClone;
    }

    @Override
    public String toString() {
        return  "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", patente=" + patente + '}';
    }
}
