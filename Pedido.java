package br.com.proo.projetoProo.pizzaria;

public class Pedido {
    
    private Item item;
    private int valor;
    
    public Pedido(Item item, int valor){
    
        this.item = item;
        this.valor = valor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
