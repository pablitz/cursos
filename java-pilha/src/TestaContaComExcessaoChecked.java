public class TestaContaComExcessaoChecked {

    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        } catch( MinhaExcecao2 ex) {
            System.out.println("tratamento ....");
        }

    }

}
