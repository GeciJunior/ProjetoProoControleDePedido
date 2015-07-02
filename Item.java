package br.com.proo.projetoProo.pizzaria;

public class Item {
    
    private int codItem;
    private int quantidade;
    private String observacao;
    
    public Item(int codItem, int quantidade, String observacao){
    
        this.codItem = codItem;
        this.quantidade = quantidade;
        this.observacao = observacao;
    
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
