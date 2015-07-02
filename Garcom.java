package br.com.proo.projetoProo.pizzaria;

public class Garcom extends Funcionario{
    
    private int codGarcom;
    
        public Garcom (String nome, String cpf, String endereco, int codGarcom){
        
            super (nome, cpf, endereco);
            this.codGarcom = codGarcom;
        }

    public int getCodGarcom() {
        return codGarcom;
    }

    public void setCodGarcom(int codGarcom) {
        this.codGarcom = codGarcom;
    }
        
    public void anotaPedido(Pedido pedido){
       System.out.println("Qual é o pedido");
    }
        
    public boolean servirMesa(){
        return false;
    }
}
