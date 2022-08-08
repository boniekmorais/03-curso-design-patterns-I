package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200.0"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000.0"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println("Imposto ICMS :  " + calculadora.calcular(orcamento, new ICMS()));
        System.out.println("Imposto ISS  :  " + calculadora.calcular(orcamento, new ISS()));
        System.out.println("Desconto 1   :  " + calculadoraDeDescontos.calcular(orcamento));
        System.out.println("Desconto 2   :  " + calculadoraDeDescontos.calcular(orcamento2));
    }

}
