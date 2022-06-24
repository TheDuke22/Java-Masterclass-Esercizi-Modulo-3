package TinderLike;

import java.util.*;

public class App {
    private HashSet <Utente> db = new HashSet<>();

    public void addUser (Utente user){
        db.add(user);
    }

    public void removeUser (Utente user){
        db.remove(user);
    }

    public Utente findLover (Utente u){


         Utente uMax = null;
         HashSet tempSet = new HashSet();
         int topSize=0;
        for (Utente u2 :db){         //ciclo
           tempSet.clear();     //svuoto il set
           tempSet.addAll(u2.getListInteressi());  //aggiungo gli interessi di u2
            if((!u2.equals(u)) && u2.LikeSausages()!=u.LikeSausages()){  // condizioni #TraditionalFamily, equals e` inutile
                tempSet.retainAll(u.getListInteressi()); //ottengo interessi in comune
                if(tempSet.size()> topSize) { //comparo il numero
                    topSize = tempSet.size(); //assegno
                    uMax = u2;}
            }
        }
        return uMax;
    }

    public List <Utente> listLover (Utente u) {
        List<Utente> list = new ArrayList<>();
        Utente uTemp;
        HashSet tempSet = new HashSet();
        for (Utente u3 : db) {
            tempSet.clear();
            tempSet.addAll(u3.getListInteressi());
            if (u3.LikeSausages() != u.LikeSausages()){
                tempSet.retainAll(u.getListInteressi());
            u3.setSizeCommonLikes(tempSet.size());
            list.add(u3);
            }
        }
        list.sort(Utente::compareTo);
        return list;
    }


}
