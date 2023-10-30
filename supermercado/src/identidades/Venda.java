package identidades;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import enumerados.Pagamento;
import enumerados.Status;
import enumerados.TipoPagamento;

public class Venda {
    private List<Produto> produtos = new ArrayList<>();
    private Cliente cliente = null;
    private Pagamento pagamento = null;
    private Status status = null;
    private TipoPagamento tipoPagamento = null;

    private Date agora = new Date();
    private Integer numero = null;
    private Integer parcelas = null;
    private Double desconto = null;
    
}
