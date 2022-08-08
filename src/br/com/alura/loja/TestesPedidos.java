package br.com.alura.loja;

import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.GerarPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

// Design Pattern: Command

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerarPedido = new GerarPedido(cliente, valorOrcamento, quantidadeItens);
        GerarPedidoHandler handler = new GerarPedidoHandler(Arrays.asList(new EnviarEmail(), new SalvarPedido()));
        handler.execute(gerarPedido);

    }
}
