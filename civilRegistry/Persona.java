package civilRegistry;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Comparable<Persona> {
   private String nome;
   private String cognome;
   private int eta;
   private String cf;
   private String residenza;
   private List<Persona> figli;

    public Persona(String nome, String cognome, int eta, String cf, String residenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
        this.residenza = residenza;
        this.figli = new ArrayList<>();
    }

    public void addSon (Persona p){
        figli.add(p);
    }
    public List <Persona> getSon (){
        return figli;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public List<Persona> getFigli() {
        return figli;
    }

    public void setFigli(List<Persona> figli) {
        this.figli = figli;
    }

    @Override
    public String toString() {
        return  nome +" "+ cognome;

    }

    @Override
    public int compareTo(Persona o) {
        return o.getEta()-this.getEta();
        //alternativa: Integer.compare(o.getEta(),this.getEta())
    }
}
