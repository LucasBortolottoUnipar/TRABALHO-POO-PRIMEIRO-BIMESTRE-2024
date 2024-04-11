
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;

import java.util.ArrayList;


public class Pedido {
    private Cliente cliente;
    private String data;
    private Boolean stEntrega;
    private ArrayList<PedidoLivro> ListaLivro = new ArrayList();
    private double valorTotal;
    public Pedido(){};

    public Pedido(Cliente cliente, String data, Boolean stEntrega, double valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.stEntrega = stEntrega;
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getStEntrega() {
        return stEntrega;
    }

    public void setStEntrega(Boolean stEntrega) {
        this.stEntrega = stEntrega;
    }

    public ArrayList<PedidoLivro> getListaLivro() {
        return ListaLivro;
    }

    public void addListaLivro(PedidoLivro ListaLivro) {
        this.ListaLivro.add (ListaLivro);
        
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", data=" + data + ", stEntrega=" + stEntrega + ", ListaLivro=" + ListaLivro + '}';
    }
    
    public double calculaValorTotal() {
        double valorTotalCompra = 0.0;
        for (PedidoLivro item : ListaLivro) {
            double valorItem = item.getQuantidadeLivro() * item.getValorUnit();
            double valorDescontoItem = valorItem * item.getValorDesconto() / 100; 
            valorTotalCompra += valorItem - valorDescontoItem;
        }
    return valorTotalCompra;
    }
}
