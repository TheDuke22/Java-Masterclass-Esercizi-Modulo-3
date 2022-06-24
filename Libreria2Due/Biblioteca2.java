package Libreria2Due;

import Libreria2.Autore;
import Libreria2.Biblioteca;
import Libreria2.Libro;

import java.security.Key;
import java.util.*;

public class Biblioteca2 implements Comparable{

    private Map<Autore2, ArrayList<Libro2>> db;
    ArrayList<Autore2> listAutore = new ArrayList<>();


    public Biblioteca2() {
        db = new TreeMap<>();
    }

    public void addLibro (Libro2 libro){
        libro.getAutore().getLibriScritti().add(libro);
        listAutore.add(libro.getAutore());
        db.put(libro.getAutore(),libro.getAutore().getLibriScritti()); // funzionera'?
    }

    public void removeLibro (Libro2 libro){
        libro.getAutore().getLibriScritti().remove(libro);
    }
    public ArrayList<Libro2> getLibro (Autore2 autore){
        return db.get(autore);
    }
    public ArrayList<Libro2> getLibro (String param) {
        ArrayList<Libro2> temp = new ArrayList<>();
        for (int j = 0; j < listAutore.size(); j++) {
            Autore2 a = listAutore.get(j);
            for (int i = 0; i < a.getLibriScritti().size(); i++) {
                if (a.getLibriScritti().get(i).getTitolo().equals(param) || a.getLibriScritti().get(i).getId().equals(param))
                    ;
                temp.add(a.getLibriScritti().get(i));

            }

        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        Biblioteca2 b = new Biblioteca2();

        Autore2 sommo = new Autore2("sommopoeta","dante","alighieri");
        Autore2 danBro = new Autore2("danbrown","Dan","Brown");
        Autore2 gianniLightBlue = new Autore2("sommissimopoeta","Gianni","Celeste");
        Libro2 divina = new Libro2("maxima","DivinaCommedia",sommo,"vojo bomba`bea");
        Libro2 poverogabbiano = new Libro2("poverogabbiano","PoveroGabbiano",gianniLightBlue,"che hai perduto la combaaaagna");
        Libro2 angelidemoni = new Libro2("angeldemons","Angeli e Demoni",danBro,"belli e brutti");
        Libro2 codiceDaVinci = new Libro2("codeToWin","Il Codice Da Vinci",danBro,"davinci doveva bomba`");
        Libro2 impiariamolalfabeto = new Libro2("kids","Impariamo L'alfabeto con Hannibal Lecter",gianniLightBlue,"gnam gnam");

        b.addLibro(divina);
        b.addLibro(poverogabbiano);
        b.addLibro(angelidemoni);
        b.addLibro(codiceDaVinci);
        b.addLibro(impiariamolalfabeto);
        b.addLibro(codiceDaVinci);

        b.removeLibro(divina);
        b.removeLibro(divina);
        b.addLibro(divina);
        System.out.println(b.getLibro(gianniLightBlue));

        System.out.println(b.db);
        System.out.println(Arrays.toString(b.db.values().toArray()));
        b.getLibro("codeToWin");
    }

    @Override
    public int compareTo(Object o) {
        return 0;

    }
}


