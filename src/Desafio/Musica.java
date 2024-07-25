package Desafio;

// caso de herança
public class Musica extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getGenero() {
        return genero;
    }

    public String getCantor() {
        return cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getClassficacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }


    }
}
