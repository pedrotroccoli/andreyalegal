package Serviços;

import erro.Erro;

public class MasterCard extends AbsBandeira{
    
    public MasterCard(Integer setor){
        super(setor);
    }

    @Override
    public String varficacaoBandeira() throws Erro {
       if(getSetor()!=54 && getSetor()!=55 && getSetor()!=56 && getSetor()!=57){
        throw new Erro("bandeira inválida");
       } else{
        return "bandeira válida";
       }
    }

    @Override
    public String verificarBandeira() throws Erro {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarBandeira'");
    }

    
} 
