package Libreria2Due;

import java.util.ArrayList;
import java.util.List;

public class Autore2 implements Comparable <Autore2> {
    private String id;
    private String nome;
    private String cognome;
    private ArrayList<Libro2> libriScritti;

    public Autore2(String id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        libriScritti = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public ArrayList<Libro2> getLibriScritti() {
        return libriScritti;
    }

    public void setLibriScritti(ArrayList<Libro2> libriScritti) {
        this.libriScritti = libriScritti;
    }

    @Override
    public String toString() {
        return getNome()+" "+getCognome();
    }

    @Override
    public int compareTo(Autore2 o) {
        return this.getNome().compareTo(o.getNome());
    }
}
