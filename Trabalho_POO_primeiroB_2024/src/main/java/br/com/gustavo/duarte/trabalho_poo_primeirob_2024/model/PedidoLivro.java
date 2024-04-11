
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;


public class PedidoLivro {
    private Livro livro;
    private int quantidadeLivro;
    private double valorUnit;
    private double valorDesconto;
    
    public PedidoLivro(){};

    public PedidoLivro(Livro livro, int quantidadeLivro, double valorUnit, double valorDesconto, double valorTotal) {
        this.livro = livro;
        this.quantidadeLivro = quantidadeLivro;
        this.valorUnit = valorUnit;
        this.valorDesconto = valorDesconto;
  
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
        this.valorUnit = livro.getPrecoVenda();
    }

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "PedidoLivro{" + "livro=" + livro + ", quantidadeLivro=" + quantidadeLivro + ", valorUnit=" + valorUnit + ", valorDesconto=" + valorDesconto + '}';
    }
}
