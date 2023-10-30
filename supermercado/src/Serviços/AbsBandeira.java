package Serviços;

public abstract class AbsBandeira implements Bandeira {
    private Integer setor = null;

    public AbsBandeira(){

    }

    public AbsBandeira(Integer setor){
        this.setor = setor;
    }

    public Integer getSetor(){
        return setor;
    }

    public void setSetor(Integer setor){
        this.setor = setor;
    }
    
}
