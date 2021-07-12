class Conta {
    private double saldo =0;
    private int agencia ;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta( int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo=100;
        System.out.println("estou criando uma conta " + this.numero);

    }


    public void deposita(double valor) {

        this.saldo+=valor;
    }

    public boolean saca(double valor){
        if (saldo >= valor){
            this.saldo-=valor;
            return true;
        }
        else{
            System.out.println("essa conta não possuí saldo suficiente! o saldo atual é de " + this.saldo);
            return false;
        }

    }
    public boolean transfere(double valor, Conta destino) {
        if (saldo >= valor) {
            saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("essa conta não possuí saldo suficiente! o saldo atual é de " + this.saldo);
            return false;

        }
    }
    public double pegaSaldo() {

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

