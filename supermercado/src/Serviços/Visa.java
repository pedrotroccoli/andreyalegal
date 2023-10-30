package Serviços;

import erro.Erro;

public class Visa extends AbsBandeira{

    public Visa(Integer setor){
        super(setor);
    }

    @Override
    public String varficacaoBandeira() throws Erro {
       
        if(getSetor()!=4){
            throw new Erro("bandeira inválida");
        }else {
            return "bandeira válida";
        }
    }

    @Override
    public String verificarBandeira() throws Erro {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarBandeira'");
    }

    
} 
