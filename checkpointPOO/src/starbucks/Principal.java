package starbucks;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Mario", "45540635412",1,1500);
        Funcionario funcionario2 = new Funcionario("Maria", "45540635412",2,1500);
        Cliente cliente = new Cliente("Nathalia", "40540540555",1,true);
        Cliente cliente2 = new Cliente("Neuza", "40540540555",2,false);
        System.out.println(cliente.getNumCadastro()); //retorna num cadastro cliente
        FranquiaStarbucks moema = new FranquiaStarbucks("StarbucksMoema","4054054050001",1);
        //System.out.println(moema.getFuncionarios()); // retornou array vazio
        moema.addFuncionarios(funcionario1);//add funcionario
        moema.addFuncionarios(funcionario2); //addfuncionario
        moema.administrarFranquia(); // retornou Administrando franquia Starbucks
        moema.pagarSalario(); // retornou todos salarios pagos
        funcionario1.atendimentoFranquia(); //funcionou Atendendo ao cliente no Balcão
        funcionario1.cadastro(); //retorna Cadastro Mario realizado com sucesso, bem vindo a nossa cia
        funcionario1.recebeSalario(); //retorna Salário 1500.0 recebido
        System.out.println(cliente.consultaFidelidade()); //retorna Você possui plano fidelidade
        cliente.cadastro(); //retorna Cadastro Nathalia realizado com sucesso, desfrute de nossos serviços
        Produto p1 = new Produto("Cafe Mocha", 2,true,15);
        Produto p2 = new Produto("Caramelo Macchiato", 2,true,12);
        List<Produto> produtos = new ArrayList<>(); //gerando uma lista para passar como parametro na mesa
        produtos.add(p1);
        produtos.add(p2);
        Pedido mesa1 = new Pedido(cliente, produtos); //passando parametros de cliente e lista de produtos no pedido
        DanfeSaida n1 = new DanfeSaida("Cafe em pó", 1, 50);
        System.out.println(n1.emitir());  // metodo retorna numero na NF emitda = 1
        DanfeEntrada n2 = new DanfeEntrada("Cafe em pó", 2, 110);
        System.out.println(n2.emitir()); // metodo retorna numero na NF emitda = 1
        System.out.println(mesa1.valorPedido()); // Retorna pedido do cliente com seu nome, produtos com as quantidades e valor a pagar
        mesa1.gerarPontosFidelidade(54); // valor pago é convertido em pontos no fidelidade
        System.out.println(cliente2.consultaFidelidade()); //consultando cliente sem  plano fidelidade

    }
}
