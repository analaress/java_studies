package exercModificadores;

public class idadePessoa {
    private String nome;
    private int idade;


    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void verificarIdade(String getNome) {
//        if (getIdade() > 18) {
//            System.out.println("Maior de 18");
//        } else {
//           System.out.println("Menor de 18");
//        }
        System.out.println(getIdade() > 18 ? "Maior de 18" : "Menor de 18" );
    }


}
