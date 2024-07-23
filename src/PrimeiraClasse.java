public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
            System.out.println("Serie.Filme: Top Gun - Maverick");

        int anoDeLancamento = 2022;
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        System.out.println("Ano de lancamento: " + anoDeLancamento);

        boolean a = true;
        boolean b = false;

        if (a || b) System.out.println("yes");
        if (!b) System.out.println("no");

        int num = 5;
        int resultado = num++;

        System.out.println(num);
        System.out.println(resultado);

        String sinopse;
        sinopse = "Serie.Filme de aventura";
        System.out.println(sinopse);

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println(String.format("senha correta: %s", senha));
        } else {
            System.out.println("senha incorreta");
        }

    }
}

