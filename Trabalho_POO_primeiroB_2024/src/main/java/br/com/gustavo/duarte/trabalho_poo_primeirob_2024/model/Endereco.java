
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;


public class Endereco {
     private String rua;
    private int numeroCasa;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    public Endereco(){};

    public Endereco(String rua, int numeroCasa, String cep, String bairro, String cidade, String estado, String pais) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numeroCasa=" + numeroCasa + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + '}';
    }
}
