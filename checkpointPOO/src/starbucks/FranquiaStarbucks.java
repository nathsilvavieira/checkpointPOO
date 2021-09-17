package starbucks;

import java.util.ArrayList;
import java.util.List;

public class FranquiaStarbucks {
    private String nomeFranquia;
    private String cnpj;
    private int numLoja;
    private List<Funcionario> funcionarios =  new ArrayList<>();

    public FranquiaStarbucks(String nomeFranquia, String cnpj, int numLoja) {
        this.nomeFranquia = nomeFranquia;
        this.cnpj = cnpj;
        this.numLoja = numLoja;

    }

    public String getNomeFranquia() {
        return nomeFranquia;
    }

    public void setNomeFranquia(String nomeFranquia) {
        this.nomeFranquia = nomeFranquia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumLoja() {
        return numLoja;
    }

    public void setNumLoja(int numLoja) {
        this.numLoja = numLoja;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void administrarFranquia(){
        System.out.println("Administrando franquia Starbucks");
    }

    public void addFuncionarios(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void pagarSalario(){
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("Pagando salario do funcionario : " + funcionarios.get(i).getNome());
            System.out.println("R$" + funcionarios.get(i).getSalario());
        }
    }



}
