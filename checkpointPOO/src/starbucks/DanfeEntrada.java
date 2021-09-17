package starbucks;

public class DanfeEntrada implements EmiteNota {
    private String descricaoItem;
    private int qtdItem;
    private double valorItem;

    public DanfeEntrada(String descricaoItem, int qtdItem, double valorItem) {
        this.descricaoItem = descricaoItem;
        this.qtdItem = qtdItem;
        this.valorItem = valorItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    @Override
    public int emitir() {
        int numNf=0;
        numNf++;
        return numNf;
    }
}
