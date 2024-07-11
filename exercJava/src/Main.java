public class Main {
    public static void main(String[] args) {

        // objeto pessoa
        Pessoa teste = new Pessoa();
        teste.exibePrint();

        // objeto calculadora
        Calculadora calcula = new Calculadora();
        System.out.println(calcula.retornaDobro(2));

        // objeto musica
        Musica musica = new Musica();

        musica.titulo = "Let's Go";
        musica.artista = "Ana Peres";
        musica.anoLancamento = 2024;
        musica.avaliacao = 7.5;

        musica.exibeFicha();

        // objeto carro
        Carro car = new Carro();

        car.modelo = "Onix Plus";
        car.cor = "Cinza Drake";
        car.anoLancamento = 2019;

        car.fichaTecnica();
        car.getIdadeCarro(2024);

        System.out.println(car.idade);

        // objeto aluno
        Aluno aluno = new Aluno();

        aluno.nome = "Ana Laressa";
        aluno.idade = 21;

        aluno.exibeDados();





    }
}