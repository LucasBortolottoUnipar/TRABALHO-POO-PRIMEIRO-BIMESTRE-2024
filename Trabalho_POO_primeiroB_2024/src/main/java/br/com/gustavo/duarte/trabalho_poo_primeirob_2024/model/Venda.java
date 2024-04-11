
package br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model;

import java.util.ArrayList;


public class Venda {
    private Pedido pedido;
    private String dataVenda;
    private ArrayList<FormaPagamento> ListaPagamentos = new ArrayList();
    
    public Venda (){};

    public Venda(Pedido pedido, String dataVenda) {
        this.pedido = pedido;
        this.dataVenda = dataVenda;
    }

    

    

    

    

    

    

    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        this.dataVenda = pedido.getData();
    }

    

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public ArrayList<FormaPagamento> getListaPagamentos() {
        return ListaPagamentos;
    }

    public void addListaPagamentos(FormaPagamento ListaPagamentos) {
        this.ListaPagamentos.add (ListaPagamentos);
        
    }

    @Override
    public String toString() {
        return "Venda{" + "pedido=" + pedido + ", dataVenda=" + dataVenda + ", ListaPagamentos=" + ListaPagamentos + '}';
    }

    

    

    
    

    

    
    
    public double calcularSegundovalor() {
        double valor2Pagamento = 0.0;
        for (FormaPagamento pago : ListaPagamentos) {
            
            valor2Pagamento = pedido.calculaValorTotal() - pago.getValorPg();
           
        }
    return valor2Pagamento;
    }
}
