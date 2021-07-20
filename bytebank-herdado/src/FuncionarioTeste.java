public class FuncionarioTeste {

    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor


    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {

        if (this.tipo == 0) { // Funcionário comum;
            return this.salario * 0.1;
        } else if (this.tipo == 1) { // Gerente;
            return this.salario;
        } else {
            return this.salario + 1000.0;
        }

    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}