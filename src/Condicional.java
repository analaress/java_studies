public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento recente");
        } else {
            System.out.println("Serie.Filme retrô");
        }

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
            nomeDia = "domingo";
            break;

            case 2:
            nomeDia = "segunda";
            break;

            default:
                nomeDia = "terça";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);

    }
}
