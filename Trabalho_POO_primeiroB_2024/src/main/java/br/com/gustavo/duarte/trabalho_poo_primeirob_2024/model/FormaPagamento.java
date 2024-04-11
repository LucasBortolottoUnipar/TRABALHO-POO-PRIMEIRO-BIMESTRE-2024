
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;


public class FormaPagamento {
     private String tipo; // se é dinheiro, cartao, boleto, pix
    private String cpfTitular;
    private String stPgto; // pendente, pago, atraso
    private String dataPgto;
    private double valorPg;
   
    public FormaPagamento(){};

    public FormaPagamento(String tipo, String cpfTitular, Venda venda, String stPgto, String dataPgto, double valorPg) {
        this.tipo = tipo;
        this.cpfTitular = cpfTitular;
        
        this.stPgto = stPgto;
        this.dataPgto = dataPgto;
        this.valorPg = valorPg;
    }

    

    

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getStPgto() {
        return stPgto;
    }

    public void setStPgto(String stPgto) {
        this.stPgto = stPgto;
    }

    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }

    public double getValorPg() {
        return valorPg;
    }

    public void setValorPg(double valorPg) {
        this.valorPg = valorPg;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "tipo=" + tipo + ", cpfTitular=" + cpfTitular + ", stPgto=" + stPgto + ", dataPgto=" + dataPgto + ", valorPg=" + valorPg + '}';
    }

    

    
}
