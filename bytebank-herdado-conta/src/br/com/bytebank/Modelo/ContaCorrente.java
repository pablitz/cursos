package br.com.bytebank.Modelo;

public class ContaCorrente extends Conta implements Tributavel{

    private  CalculadorImposto calculadorImposto;

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
        CalculadorImposto calculadorImposto = new CalculadorImposto();
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
         super.saca(valor+ 0.2);
    }

    @Override
    public double getValorImposto() {
        return super.saldo *0.01 ;
    }
}
