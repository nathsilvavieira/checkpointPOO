package starbucks;

import java.util.List;

public class Cliente extends Pessoa{
    private int numCadastro;
    private boolean planoFidelidade;

    public Cliente(String nome, String cpf, int numCadastro , boolean planoFidelidade) {
        super(nome, cpf);
        this.numCadastro =numCadastro;
        this.planoFidelidade = planoFidelidade;
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public void setNumCadastro(int numCadastro) {
        this.numCadastro = numCadastro;
    }

    public boolean isPlanoFidelidade() {
        return planoFidelidade;
    }

    public void setPlanoFidelidade(boolean planoFidelidade) {
        this.planoFidelidade = planoFidelidade;
    }

    @Override
    public void cadastro(){
        System.out.println(" Cadastro "+getNome()+" realizado com sucesso, desfrute de nossos serviços");
    }
    public String consultaFidelidade(){
        if(planoFidelidade==true) {
            return "Você possui plano fidelidade";
        }
        return "Cliente "+ getNome() +" não possui plano fidelidade";
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numCadastro=" + numCadastro +
                ", planoFidelidade=" + planoFidelidade +
                '}';
    }
}
