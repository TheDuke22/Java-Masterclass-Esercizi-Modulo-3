package Libreria2Due;

public class Libro2 implements Comparable<Libro2> {
    private String id;
    private String titolo;
    private Autore2 autore;
    private String sinossi;

    public Libro2(String id, String titolo, Autore2 autore, String sinossi) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.sinossi = sinossi;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore2 getAutore() {
        return autore;
    }

    public void setAutore(Autore2 autore) {
        this.autore = autore;
    }

    public String getSinossi() {
        return sinossi;
    }

    public void setSinossi(String sinossi) {
        this.sinossi = sinossi;
    }

    @Override
    public String toString() {
        return this.getTitolo();
    }
    @Override
    public int compareTo(Libro2 o) {
        return this.getTitolo().compareTo(o.getTitolo());
    }
}

