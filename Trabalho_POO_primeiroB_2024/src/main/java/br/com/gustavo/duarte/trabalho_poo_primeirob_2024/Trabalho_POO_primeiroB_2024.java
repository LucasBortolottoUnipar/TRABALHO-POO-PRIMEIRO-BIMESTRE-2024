

package br.com.gustavo.duarte.trabalho_poo_primeirob_2024;

import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.Cliente;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.Endereco;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.FormaPagamento;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.Livro;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.PedidoLivro;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.Venda;
import br.com.gustavo.duarte.trabalho_poo_primeirob_2024.model.Pedido;


public class Trabalho_POO_primeiroB_2024 {

    public static void main(String[] args) {
       

//        //CLIENTE 01
            Endereco enderecoCliente01Fixo = new Endereco();
            enderecoCliente01Fixo.setRua("7 de Setembro");
            enderecoCliente01Fixo.setNumeroCasa(1471);
            enderecoCliente01Fixo.setCep("85902-050");
            enderecoCliente01Fixo.setBairro("Jardim La Salle");
            enderecoCliente01Fixo.setCidade("Toledo");
            enderecoCliente01Fixo.setEstado("Paraná");
            enderecoCliente01Fixo.setPais("Brasil");

            Cliente cliente01Fixo = new Cliente();
            cliente01Fixo.setNome("Lucas Leonardo Bortolotto");
            cliente01Fixo.setDataNascimento("14/09/1997");
            cliente01Fixo.setEmail("engllbortolotto@gmail.com");
            cliente01Fixo.setTelefone("(45)99918-7271");
            cliente01Fixo.setRg("10.663.534-8");
            cliente01Fixo.setCpf("086.364.789-64");
            cliente01Fixo.setStCivil("Solteiro");
            cliente01Fixo.setEndereco(enderecoCliente01Fixo);
            
            
            //CLIENTE 02
            
            Endereco enderecoCliente02Fixo = new Endereco();
            enderecoCliente02Fixo.setRua("7 de Setembro");
            enderecoCliente02Fixo.setNumeroCasa(825);
            enderecoCliente02Fixo.setCep("85935-000");
            enderecoCliente02Fixo.setBairro("Centro");
            enderecoCliente02Fixo.setCidade("Assis Chat");
            enderecoCliente02Fixo.setEstado("Paraná");
            enderecoCliente02Fixo.setPais("Brasil");
            
            
            Cliente cliente02Fixo = new Cliente();
            cliente02Fixo.setNome("Gustavo Petrachim Duarte");
            cliente02Fixo.setDataNascimento("03/08/2005");
            cliente02Fixo.setEmail("Gustavo.P.Drt@gmail.com");
            cliente02Fixo.setTelefone("(44) 9 97533997");
            cliente02Fixo.setRg("47.561.008-8");
            cliente02Fixo.setCpf("449.105.580-71");
            cliente02Fixo.setStCivil("Solteiro");
            cliente02Fixo.setEndereco(enderecoCliente02Fixo);
            
            
            //CLIENTE 03
            
            Endereco enderecoCliente03Fixo = new Endereco();
            enderecoCliente03Fixo.setRua("Santos Dumont");
            enderecoCliente03Fixo.setNumeroCasa(2870);
            enderecoCliente03Fixo.setCep("85900-010");
            enderecoCliente03Fixo.setBairro("Centro");
            enderecoCliente03Fixo.setCidade("Toledo");
            enderecoCliente03Fixo.setEstado("Paraná");
            enderecoCliente03Fixo.setPais("Brasil");

            Cliente cliente03Fixo = new Cliente();
            cliente03Fixo.setNome("Vinicius Robetti França");
            cliente03Fixo.setDataNascimento("07/08/1998");
            cliente03Fixo.setEmail("vinicius.franca@edu.unipar.br");
            cliente03Fixo.setTelefone("(45)99941-6458");
            cliente03Fixo.setRg("11.677.555-9");
            cliente03Fixo.setCpf("088.889.998-89");
            cliente03Fixo.setStCivil("Solteiro");
            cliente03Fixo.setEndereco(enderecoCliente03Fixo);
            
            
            
            //Livro 01
            Livro livro01 = new Livro();
            livro01.setTitulo("Harry Potter e a Pedra Filosofal");
            livro01.setAutor("J. K. Rowling");
            livro01.setGenero("Literatura e Ficção");
            livro01.setEditora("Rocco");
            livro01.setAnoLancamento(1997);
            livro01.setNumPaginas(208);
            livro01.setPrecoVenda(37.42);
            livro01.setIdioma("Portugues");
            livro01.setIsbn(" 8532530788");
            livro01.setQuantidadeEstoque(9);
            livro01.setCodigoLocalizador("H019");
           
            
            //Livro 02
            Livro livro02 = new Livro();
            livro02.setTitulo("Harry Potter e a Câmara Secreta");
            livro02.setAutor("J. K. Rowling");
            livro02.setGenero("Literatura e Ficção");
            livro02.setEditora("Rocco");
            livro02.setAnoLancamento(2000);
            livro02.setNumPaginas(288);
            livro02.setPrecoVenda(44.92);
            livro02.setIdioma("Portugues");
            livro02.setIsbn(" 853251166X");
            livro02.setQuantidadeEstoque(11);
            livro02.setCodigoLocalizador("H020");
            
            
            //livro 03
            Livro livro03 = new Livro();
            livro03.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
            livro03.setAutor("J. K. Rowling");
            livro03.setGenero("Literatura e Ficção");
            livro03.setEditora("Rocco");
            livro03.setAnoLancamento(2000);
            livro03.setNumPaginas(349);
            livro03.setPrecoVenda(48.52);
            livro03.setIdioma("Portugues");
            livro03.setIsbn(" 1781103704");
            livro03.setQuantidadeEstoque(12);
            livro03.setCodigoLocalizador("H021");
            

            PedidoLivro item1 = new PedidoLivro();
            item1.setLivro(livro01); // Associa o livro ao item
            item1.setQuantidadeLivro(1); // Define a quantidade comprada
            // Adicionando o livro01 ao pedido com uma quantidade e calculando o valor total
            item1.setValorDesconto(20); 
            
            PedidoLivro item2  = new PedidoLivro();
            item2.setLivro(livro02);
            item2.setQuantidadeLivro(1);
            item2.setValorDesconto(0);
            
            
            PedidoLivro item3 =  new PedidoLivro();
            item3.setLivro(livro03);
            item3.setQuantidadeLivro(3);
            item3.setValorDesconto(0);
            
            Pedido pedido01 = new Pedido();
            pedido01.setCliente(cliente01Fixo);
            pedido01.setData("08/04/2024");
            pedido01.setStEntrega(Boolean.FALSE);
            pedido01.addListaLivro(item1);
            pedido01.addListaLivro(item2);
            pedido01.addListaLivro(item3);
           
            double valorTotalPedido = pedido01.calculaValorTotal();
            System.out.printf("Valor Total do Pedido: %.2f%n" , valorTotalPedido);
            
            
            FormaPagamento pago01 = new FormaPagamento();
            pago01.setTipo("Dinheiro");
            pago01.setCpfTitular("086.364.789-64");
            pago01.setStPgto("Pago");
            pago01.setDataPgto("08/04/2024");
            pago01.setValorPg(100.00);
            
            
            FormaPagamento pago02 = new FormaPagamento();
           
            pago02.setTipo("Cartão de crédito");
            pago02.setCpfTitular("086.364.789-64");
            pago02.setStPgto("Pago");
            pago02.setDataPgto("08/04/2024");
            
            Venda venda01 = new Venda();
            
            venda01.setPedido(pedido01);
            venda01.addListaPagamentos (pago01);            
            pago02.setValorPg(venda01.calcularSegundovalor()); // adc a sobra do 1 pagamento para o segundo pagamento 
            venda01.addListaPagamentos(pago02);
            venda01.setDataVenda(pedido01.getData());
            System.out.println(venda01.toString());
            
            
           for (PedidoLivro item : pedido01.getListaLivro()) {
            Livro livro = item.getLivro();
            int quantidadeVendida = item.getQuantidadeLivro();
            int quantidadeRestante = livro.getQuantidadeEstoque() - quantidadeVendida;
            System.out.println("Quantidade restante de " + livro.getTitulo() + ": " + quantidadeRestante);//Atualização de estoque
    }
}
}
