package br.com.alura.loja.desconto;

// Design Pattern - Chain of Responsibility

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoItens(new DescontoAcimaQuinhentos(new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }

}
