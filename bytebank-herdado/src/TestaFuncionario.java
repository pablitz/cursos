public class TestaFuncionario {
    public static void main(String[] args){

        Cliente cliente = new Cliente();



        Funcionario nico = new Gerente();
        nico.setNome("nico steppat");
        nico.setSalario(2600);
        nico.setCpf("223355646-9");

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
    
    
}
