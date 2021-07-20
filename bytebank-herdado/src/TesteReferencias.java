public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        String nome = g1.getNome();
        g1.setSalario(5000.0);
        //g1.autentica(2222);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);

        Funcionario f =new Gerente();
        f.setSalario(2000);
        controle.registra(f);

        EditorDeVideo Ev = new EditorDeVideo();
        Ev.setSalario(2500);
        controle.registra(Ev);

        Designer Ds = new Designer();
        Ds.setSalario(2000);
        controle.registra(Ev);

        System.out.println(controle.getSoma());

    }
}