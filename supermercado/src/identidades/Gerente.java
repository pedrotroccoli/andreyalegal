package identidades;

import erro.Erro;

public class Gerente extends Funcionario{
    private Double comissao = null;

    public Gerente(){

    }

    public Gerente(String nome, Double salario, Double desconto, Double comissao){
        super(nome, salario, desconto);
        this.comissao = comissao;
    }

    @Override
    public double calculoSalario() {

        return (getSalario() - getDesconto() + comissao);
    }

    @Override
    public String formatacao() {
        return  "Nome: "+getNome()+", Salário base: "+getSalario()+", Salário final: "+calculoSalario();
    }

    @Override
    public void verificacao() throws Erro {
        if(getNome()==null || getSalario()==null || getDesconto()==null || comissao==null){
            throw new Erro("gerente não identificado");
        }

    }
}
