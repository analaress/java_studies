public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

//     métodos

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }

    double retornaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
