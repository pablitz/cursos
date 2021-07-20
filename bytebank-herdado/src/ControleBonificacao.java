import org.jetbrains.annotations.NotNull;

public class ControleBonificacao {

    private int soma ;



    public int getSoma() {
        return soma;
    }

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma += boni;
    }



}