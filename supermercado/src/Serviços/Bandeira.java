package Serviços;

import erro.Erro;

public interface Bandeira {

    String verificarBandeira() throws Erro;

    public abstract String varficacaoBandeira() throws Erro;

    default String senha(int senha) throws Erro{
        if (senha==123){
            return "senha válida";
        } else{
            throw new Erro("senha inválida");
        }
        
    }
    
}

