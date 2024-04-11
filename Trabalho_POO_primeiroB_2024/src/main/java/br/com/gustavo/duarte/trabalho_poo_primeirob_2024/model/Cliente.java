
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;


public class Cliente {
     private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private String rg;
    private String cpf;
    private String stCivil;
    private Endereco endereco;
    public Cliente(){};

    public Cliente(String nome, String dataNascimento, String email, String telefone, String rg, String cpf, String stCivil, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.stCivil = stCivil;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStCivil() {
        return stCivil;
    }

    public void setStCivil(String stCivil) {
        this.stCivil = stCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email + ", telefone=" + telefone + ", rg=" + rg + ", cpf=" + cpf + ", stCivil=" + stCivil + ", endereco=" + endereco + '}';
    }  
}
