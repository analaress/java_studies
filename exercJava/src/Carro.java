public class Carro {
    String modelo;
    String cor;
    int anoLancamento;
    int idade;

    void fichaTecnica() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Cor: " + cor);
    }

    int getIdadeCarro(int anoAtual) {
        idade = anoAtual - anoLancamento;
        return idade;
    }

}
