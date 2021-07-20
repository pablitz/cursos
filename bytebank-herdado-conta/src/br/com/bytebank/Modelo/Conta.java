package br.com.bytebank.Modelo;

public abstract class Conta {
    protected double saldo =0;
    private int agencia ;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta( int agencia, int numero) {

        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }


        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo=0;
        System.out.println("estou criando uma conta " + this.numero);

    }


    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if (saldo < valor){
            throw new SaldoInsuficienteException("Saldo :" + this.saldo + ",Valor :"+valor);
        }
        this.saldo-=valor;
        }


    public void transfere (double valor, Conta destino) throws SaldoInsuficienteException{
    this.saca(valor);
    destino.deposita(valor);


    }
    public double getSaldo() {

        return this.saldo;

    }

    public int getNumero(){

        return this.numero;
    }

    public int getAgencia(){


        return this.agencia;

    }

    public void setAgencia(int agencia){
        if (agencia <= 0) {
            System.out.println("não são permitidos valores negativos");
            return;
        }
        this.agencia = agencia ;
    }

    public void setNumero(int novoNumero){
        if (numero <= 0) {
            System.out.println("não são permitidos valores negativos ");
            return;
        }
        this.numero = novoNumero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;

    }

    public Cliente getTitular() {

        return titular;
    }

    public static int getTotal(){

        return Conta.total;
    }

}

