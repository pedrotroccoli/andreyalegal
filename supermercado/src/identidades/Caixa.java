package identidades;

import erro.Erro;

public class Caixa extends Funcionario{
    private Integer caixa = null;

    public Caixa(){

    }

    public Caixa(String nome, Double salario, Double desconto, Integer caixa){
        super(nome, salario, desconto);
        this.caixa = caixa;
    }

    public Integer getCaixa(){
        return caixa;
    }

    public void setCaixa(Integer caixa){
        this.caixa = caixa;
    }

    @Override
    public double calculoSalario() {
        return (getSalario() - getDesconto());    
    }

    @Override
    public String formatacao() {
        return "Nome: "+getNome()+", Guiche: "+getCaixa()+", Salário base: "+ getSalario()+", Salário final: "+ calculoSalario();
   }

    @Override
    public void verificacao() throws Erro {
       if (getNome()==null || getSalario()==null || getDesconto()==null || caixa==null){
        throw new Erro("caixa não identificado");
       }
    }
}
