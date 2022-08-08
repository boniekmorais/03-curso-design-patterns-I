package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.Acao;

import java.time.LocalDateTime;
import java.util.List;

// Design Pattern: Observer

public class GerarPedidoHandler {

    private List<Acao> acoes;

    // Construtor com injecao de dependencias: repository, service, etc.

    public GerarPedidoHandler(List<Acao> acoes) {
        this.acoes = acoes;
    }

    public void execute(GerarPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        acoes.forEach(a -> a.executar(pedido));
    }
}
