package Desafio_6.model;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {

    private Long id;
    private LocalDate dataPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<OrcamentoItens> itens;

    public Orcamento(Long id, LocalDate dataPedido, Cliente cliente, Vendedor vendedor, List<OrcamentoItens> itens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<OrcamentoItens> getItens() {
        return itens;
    }

    public void setItens(List<OrcamentoItens> itens) {
        this.itens = itens;
    }
}
