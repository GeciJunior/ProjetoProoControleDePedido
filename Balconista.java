package br.com.proo.projetoProo.pizzaria;

public class Balconista extends Funcionario{
    
    final int matricula;
    
        public Balconista(String nome, String cpf, String endereco, int matricula){
        
            super (nome, cpf, endereco);
            this.matricula = matricula;
        }

    public int getMatricula() {
        return matricula;
    }
    
        public void adicionaPedido(Cliente cliente) {
            

    }
    
}
