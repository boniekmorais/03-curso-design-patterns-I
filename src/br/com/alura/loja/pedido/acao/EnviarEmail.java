package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmail implements Acao {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Enviar e-mail com dados do pedido : " + pedido.getCliente());
    }
}
