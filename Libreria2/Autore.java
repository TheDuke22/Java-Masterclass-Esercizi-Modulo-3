package Libreria2;

import java.util.ArrayList;
import java.util.List;

public class Autore {
    private String codice;
    private String Nome;
    private String cognome;
    private List<Libro> listaLibbri;

    public Autore(String codice, String nome, String cognome) {
        this.codice = codice;
        Nome = nome;
        this.cognome = cognome;
        listaLibbri = new ArrayList<>();
    }

    public void addLibroAutore (Libro l){
        listaLibbri.add(l);
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Libro> getListaLibbri() {
        return listaLibbri;
    }

    public void setListaLibbri(List<Libro> listaLibbri) {
        this.listaLibbri = listaLibbri;
    }

}
