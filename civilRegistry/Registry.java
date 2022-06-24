package civilRegistry;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Registry {
   private HashSet <Persona> db;

    public Registry() {
        db= new HashSet<>();
    }

    public void addPersona(Persona p){
    db.add(p);
    }
    public void removePersona(String cf){
       Persona cfToRemove = db.stream().filter(x-> x.getCf().equals(cf)).findFirst().get();
       db.remove(cfToRemove);
    }

    public List<Persona> getPersona (String nome){
        return db.stream().filter(x -> x.getNome().toLowerCase().startsWith(nome.toLowerCase())).toList();
    }

    public void printdb(){
        for (Persona persona : db) {
            System.out.println(persona);

        }
    }
    public List <Persona> getOlder (){

       return db.stream().sorted(Persona::compareTo).limit(3).toList();
    }

    public List <String> getAddress (String nome){
        return db.stream().filter(x-> x.getNome().equalsIgnoreCase(nome.toLowerCase())).map(x-> x.getResidenza()).toList();
    }

    public void getSon (String nome){
        db.stream().filter(x-> x.getNome().equalsIgnoreCase(nome.toLowerCase())).toList().forEach(x-> System.out.println(x.getFigli()));
    }


        public static void main(String[] args) {
        Registry r = new Registry();


        Persona topona2002 = new Persona("titti","Carlucci",31,"dfsbdtr21", "via fasulla 123");
        Persona topona2003 = new Persona("tittona","Carluccia",51,"dskgjw21", "via vera 123");
        Persona topona1903 = new Persona("tettona","Carluccia",21,"dfhmm265", "via vera 123");
        Persona topona03 = new Persona("titti","Carluccia",55,"fkdnakferm64", "via vera 123");
        Persona topona09 = new Persona("titti","Carluccia",11,"fkdnferm64", "via vera 123");





        r.addPersona(topona2002);
        r.addPersona(topona2003);
        r.addPersona(topona1903);
        r.addPersona(topona03);
        r.addPersona(topona09);
        topona03.addSon(topona09);
        topona2002.addSon(topona1903);
        topona2002.addSon(topona2003);
        System.out.println(r.getPersona("titto"));
            System.out.println(r.getOlder());
            System.out.println(r.getAddress("titti"));

            r.getSon("Titti");

    }
}
