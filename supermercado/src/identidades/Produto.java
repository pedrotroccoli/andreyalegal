package identidades;

public class Produto {
    private Integer numero = null;
    private String nomeProduto = null;
    private Double preçoUnitario = null;
    private Integer quantidade = null;

    public Produto(){

    }

    public Produto(Integer numero, String nomeProduto, Double preçoUnitario, Integer quantidade){
        this.numero = numero;
        this.nomeProduto = nomeProduto;
        this.preçoUnitario = preçoUnitario;
        this.quantidade = quantidade;
    }


    public double valorCompra(){
        return preçoUnitario*quantidade;
    }

    @Override
    public String toString(){
        return numero+" - "+nomeProduto+" R$"+preçoUnitario+" x "+quantidade+" = "+" R$"+valorCompra();
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public double getPreçoUnitario(){
        return preçoUnitario;
    }

    public void setPreçoUnitario(Double preçoUnitario){
        this.preçoUnitario = preçoUnitario;
    }

    public Integer getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

}
