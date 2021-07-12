public class TesteEscopoVariaveis {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int QuantidadePessoas= 2;
        boolean acompanhado;
        if (QuantidadePessoas >=2){
             acompanhado = true;
        }else{
             acompanhado = false;
        }
        if (idade >=18 && acompanhado){
            System.out.println("seja bem vindo");
        }
        else {
            System.out.println("você não pode entrar");
        }

    }
}
