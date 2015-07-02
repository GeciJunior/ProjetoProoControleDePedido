package br.com.proo.projetoProo.pizzaria;

public class Cliente {
    
    int numeroMesa;
    
    public Cliente (int numeroMesa){
    
        this.numeroMesa = numeroMesa;
    
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }   
    
    public boolean fazerPagamento(){
        return false;
        
    }
}
