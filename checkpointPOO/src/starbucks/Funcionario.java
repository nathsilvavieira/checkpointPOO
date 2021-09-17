package starbucks;

public class Funcionario extends Pessoa{
    private double salario;
    private int numReg;

    public Funcionario(String nome, String cpf, int numReg, double salario) {
        super(nome, cpf);
        this.numReg = numReg;
        this.salario = salario;
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg = numReg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void cadastro(){
        System.out.println(" Cadastro "+getNome()+" realizado com sucesso, bem vindo a nossa cia");
    }

    public void atendimentoFranquia(){
        System.out.println(" Atendendo ao cliente no Balcão");
    }

    public void recebeSalario(){
        System.out.println(" Salário " +getSalario()+" recebido");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
