package br.com.bytebank.Modelo;

public class CalculadorImposto {



    protected double Valor ;

    public double getValorImposto(){

        return this.Valor;
    }

    public void registra(Tributavel t){
       double valor = t.getValorImposto();
        this.Valor += valor;
    }


}