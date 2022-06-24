package arcadeRank;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArcadeWorld {
    long count;
     List <User> userDB = new ArrayList<>();
     List <Game> gameDB= new ArrayList<>();

    public void addUser (User u){
        userDB.add(u);
    }
    public void addGame (Game g) {
        gameDB.add(g);
    }


    public void newGame (User u, Game g, long score){
       if (u.getScore()>0) {
           User j = new User(u.getUsername(), u.getId());
           j.setScore(score);
           g.getScores().add(j);
           j.setGameNum(count);
           count++;
       }
       else {
           u.setScore(score);     // in origine era solo questo, poi ho scoperto che le variabili delle classi
           g.getScores().add(u);  // non possono essere sovrascritte e ho messo una toppa
           u.setGameNum(count);
           count++;
       }
    }
    public List <User> getClassificaGame (int id){
      return gameDB.stream().filter(x-> x.getGameID()==id).findAny().get().getScores()
              .stream().sorted(User::compareTo).toList().subList(0,3);
    }
    public List <User> getLastGames(int n) throws ArrayIndexOutOfBoundsException{
        return gameDB.stream().flatMap(game -> game.getScores().stream().sorted(User::compareTo2)).toList().subList(0,n);
    }



    public List <User> globalScores (){
        return gameDB.stream().flatMap(game -> game.getScores().stream().sorted(User::compareTo)).toList().subList(0,3);
    }

    public static void main(String[] args) {
        ArcadeWorld arcade = new ArcadeWorld();
        Game galaga = new Game("galaga",3,101);
        Game pacman = new Game("Pac-man",2,333);
        User viscie = new User("viscienzo",341);
        User mariello = new User("MarielloBello",123);
        User giangi = new User("GiangiFromMilan",20124);

        arcade.addUser(viscie);

        arcade.addUser(giangi);
        arcade.addUser(mariello);
        arcade.addGame(galaga);
        arcade.addGame(pacman);
        arcade.newGame(viscie,galaga,29099998);
        arcade.newGame(mariello,galaga,9909997);
        arcade.newGame(giangi,galaga,39990998);
        arcade.newGame(mariello,galaga,99099998);
        arcade.newGame(viscie,galaga,4909997);
        arcade.newGame(viscie,galaga,1);
        arcade.newGame(viscie,pacman,14909997);

        System.out.println(arcade.getClassificaGame(101));
        System.out.println(galaga.getScores());
        System.out.println(arcade.getLastGames(5));

    }

}
