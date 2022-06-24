package Libreria2;

public class Libro implements Comparable<Libro> {
    private String codice;
    private String titolo;
    private Autore autore;
    private String sinossi;

    public Libro(String codice, String titolo, Autore autore, String sinossi) {
        this.codice = codice;
        this.titolo = titolo;
        this.autore = autore;
        this.sinossi = sinossi;
    }



    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
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
        return  titolo + " ";
    }

    @Override
    public int compareTo(Libro o) {
        Libro c = (Libro) o;
        String uno = c.getTitolo();
        String due = this.getTitolo();
       return due.compareTo(uno);
    }

    /*@Override
    public int compareTo(Libro o) {
        if (o.getTitolo().charAt(0)<this.getTitolo().charAt(0))
            return 1;
        if (o.getTitolo().charAt(0)>this.getTitolo().charAt(0))
            return -1;
        else return 0;

    }*/

}
