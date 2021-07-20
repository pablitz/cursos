package br.com.bytebank.Modelo.Teste;

import br.com.bytebank.Modelo.CalculadorImposto;
import br.com.bytebank.Modelo.ContaCorrente;
import br.com.bytebank.Modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.print(calc.getValorImposto());

    }
}