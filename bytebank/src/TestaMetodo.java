import java.awt.desktop.SystemSleepEvent;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        System.out.println(contaDoPaulo.saldo);
        contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        contaDoPaulo.saca(2500);

        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposita(1000);

        System.out.println(contaDaMarcela.saldo);

        boolean sucessoTransferencia =
                contaDaMarcela.transfere(300, contaDoPaulo);

        if(sucessoTransferencia){

            System.out.println("Transferência realizada com sucesso");

        }else{

            System.out.println("Falha na transferência");

        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);

    }


}
