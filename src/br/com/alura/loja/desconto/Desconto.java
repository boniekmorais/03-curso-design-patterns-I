package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

// Design Pattern - Template Method

public abstract class Desconto {

    protected Desconto proximo;

    protected Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // Template Method - Faz parte do processo na classe mae e delega parte para classes abstradas.

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveAplicar(Orcamento orcamento);

}
