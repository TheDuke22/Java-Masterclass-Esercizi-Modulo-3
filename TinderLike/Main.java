package TinderLike;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        Interesse calcio = new Interesse(1, "calcio");
        Interesse sballo = new Interesse(11, "sballo");
        Interesse manga = new Interesse(21, "manga");
        Interesse pizza = new Interesse(12, "pizza");
        Interesse viaggi = new Interesse(16, "viaggi");
        Interesse allegria = new Interesse(44, "RuotaDellaFortuna");
        Interesse barbie = new Interesse(56,"Barbie");
        Interesse moda = new Interesse(65, "moda");
        Interesse alcolismo = new Interesse (29, "alcol");


        Utente ghiaffio = new Utente("ghiaffio","alfiuccio", true, 24);
        Utente mike = new Utente("magicMike49","MikeBongiorno",true,99);
        Utente topona= new Utente("topona99","MichelePlacido", true,48);
        Utente passerotta= new Utente("passera'","jennyPlay", false,38);
        Utente federica= new Utente("FedericaBellaF..accia","federicaFede", false,29);
        Utente jenni= new Utente("JenniACarogna", "gienniGennara", false, 31);

        mike.putInteressi(List.of(calcio,allegria,pizza,alcolismo));
        ghiaffio.putInteressi(List.of(calcio,allegria, pizza, barbie));
        topona.putInteressi(List.of(calcio,sballo, moda, alcolismo, viaggi));
        passerotta.putInteressi(List.of(allegria,manga,viaggi, pizza));
        federica.putInteressi(List.of(viaggi,manga,moda,barbie, alcolismo));
        mike.putInteressi(List.of(calcio,sballo,allegria, viaggi));
        jenni.putInteressi(List.of(allegria, pizza, manga, barbie,alcolismo));


        app.addUser(mike);
        app.addUser(ghiaffio);
        app.addUser(topona);
        app.addUser(passerotta);
        app.addUser(federica);
        app.addUser(jenni);

        System.out.println(mike.getListInteressi());
        System.out.println(jenni.getListInteressi());
        System.out.println(federica.getListInteressi());

        System.out.println(app.findLover(topona));
        System.out.println(app.findLover(ghiaffio));
        System.out.println(app.findLover(federica));


        System.out.println(app.listLover(federica));
        System.out.println(app.listLover(ghiaffio));



       // System.out.println(mike.getListInteressi());
      //  System.out.println(ghiaffio.getListInteressi());
      //  System.out.println(topona.getListInteressi());






    }
}
