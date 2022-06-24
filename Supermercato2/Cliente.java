package Supermercato2;

public class Cliente implements Comparable <Cliente> {
    String nome;
    String cognome;
    int eta;
    int id;

    public Cliente(String nome, String cognome, int eta, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Cliente o) {
        Cliente c = (Cliente)o;

        if (c.getEta()< this.getEta())
            return-1;
        if (c.getEta()> this.getEta())
            return 1;
        return 0;
    }
}
