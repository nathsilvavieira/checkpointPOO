package starbucks;

public class Produto {
    private String nomeProduto;
    private int qntProduto;
    private boolean estoque;
    private double precoProduto;

    public Produto(String nomeProduto, int qntProduto, boolean estoque, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.qntProduto = qntProduto;
        this.estoque = estoque;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQntProduto() {
        return qntProduto;
    }

    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", qntProduto=" + qntProduto +
                '}';
    }
}
