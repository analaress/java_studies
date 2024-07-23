package Calculo;
import Heranca.Filme;
import Heranca.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }
}



