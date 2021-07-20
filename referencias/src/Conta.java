public class Conta {
    double saldo =100;
    int agencia = 42;
    int numero;
    Cliente titular;

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
}