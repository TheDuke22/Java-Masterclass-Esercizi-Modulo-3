package Libreria2;

import org.w3c.dom.ls.LSOutput;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaBiblioteca = new ArrayList<>();


    public List<Libro> getListaBiblioteca() {
        return listaBiblioteca;
    }

    public void addLibro (Libro l) {
        if(!(listaBiblioteca.contains(l))){
            listaBiblioteca.add(l);
            l.getAutore().addLibroAutore(l);
            System.out.println("aggiunto!");
        } else System.out.println("libro gia' presente, spiaze");

    }

    public void removeLibro (Libro l){
        if (listaBiblioteca.contains(l)){
                listaBiblioteca.remove(l);
            System.out.println("libro rimosso");
            return;

        }
        else System.out.println("il libro non esiste, spiaze");
    }

    public List<Libro> searchLibro (String param){
        List <Libro> listona = new ArrayList<>();
        for (int i = 0; i < listaBiblioteca.size(); i++) {
            if (listaBiblioteca.get(i).getAutore().getNome().equals(param)
                    || listaBiblioteca.get(i).getTitolo().equals(param)
                    || listaBiblioteca.get(i).getCodice().equals(param) )
                listona.add(listaBiblioteca.get(i));
        }return listona;
    }

    public void printTitoloAndSinossi (Autore autore){
        autore.getListaLibbri().sort(Libro::compareTo);
        for (int i = 0; i < autore.getListaLibbri().size(); i++) {
            System.out.println("TITOLO: "+ autore.getListaLibbri().get(i).getTitolo() + " "+ "SINOSSI: "
                     + autore.getListaLibbri().get(i).getSinossi()+ "\n") ;

        }
    }




    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Autore sommo = new Autore("sommopoeta","dante","alighieri");
        Autore danBro = new Autore("danbrown","Dan","Brown");
        Autore gianniLightBlue = new Autore("sommissimopoeta","Gianni","Celeste");
        Libro divina = new Libro("maxima","DivinaCommedia",sommo,"vojo bomba`bea");
        Libro poverogabbiano = new Libro("poverogabbiano","PoveroGabbiano",gianniLightBlue,"che hai perduto la combaaaagna");
        Libro angelidemoni = new Libro("angeldemons","Angeli e Demoni",danBro,"belli e brutti");
        Libro codiceDaVinci = new Libro("codeToWin","Il Codice Da Vinci",danBro,"davinci doveva bomba`");
        Libro impiariamolalfabeto = new Libro("kids","Impariamo L'alfabeto con Hannibal Lecter",gianniLightBlue,"gnam gnam");

        b.addLibro(divina);
        b.addLibro(poverogabbiano);
        b.addLibro(angelidemoni);
        b.addLibro(codiceDaVinci);
        b.addLibro(impiariamolalfabeto);
        b.addLibro(codiceDaVinci);

        b.removeLibro(divina);
        b.removeLibro(divina);
        b.addLibro(divina);


        System.out.println(b.searchLibro("Gianni"));
        System.out.println(b.searchLibro("codeToWin"));
        System.out.println(b.searchLibro("Dan"));
        b.printTitoloAndSinossi(gianniLightBlue);


        System.out.println(b.listaBiblioteca);
        b.listaBiblioteca.sort(Libro::compareTo);
        System.out.println(b.listaBiblioteca);

        //String a ="ba";
       // String c = "ab";
       // System.out.println(a.compareTo(c));






    }
}
