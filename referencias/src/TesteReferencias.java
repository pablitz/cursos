public class TesteReferencias {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();


        contaDaMarcela.titular = new Cliente();


        contaDaMarcela.titular.nome = "Marcela";
    }
}
