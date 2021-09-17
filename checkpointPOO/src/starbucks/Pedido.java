package starbucks;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);

    }

    public String valorPedido(){
        double valor =0;
        for (Produto produto:produtos) {
           valor += produto.getQntProduto() * produto.getPrecoProduto();
        }

        return "Pedido do cliente "+ getCliente().getNome().toString()+": \n" +getProdutos().toString() +"valor total da conta R$ "+valor;
    }

    public void gerarPontosFidelidade(int valor){
        if(cliente.isPlanoFidelidade()==true){
            int pontos=0;
                   pontos+=valor;
            System.out.println( getCliente().getNome().toString() + " recebeu pontos pelo plano fidelidade no total de  "+ pontos+" pontos.");
        }

    }


    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente.getNome() +
                '}';
    }
}
