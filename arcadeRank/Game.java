package arcadeRank;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game implements  Comparable <Game> {
    private String name;
    private int difficulty;
    private List<User> scores;
    private long gameNum=0;
    private int gameID;

    public Game(String name, int difficulty, int gameID) {
        this.name = name;
        this.difficulty = difficulty;
        this.gameID = gameID;
        scores = new ArrayList<>();
    }

    public long sumScore (User u){
       return u.getScore()*getDifficulty();
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<User> getScores() {
        return scores;
    }


    public void setScores(List<User> scores) {
        this.scores = scores;
    }

    public  long getGameNum() {
        return gameNum;
    }

    public  void setGameNum(long gameNum) {
        this.gameNum = gameNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameID == game.gameID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID);
    }

    @Override
    public int compareTo(Game o) {
        return Long.compare(o.getGameNum(),this.getGameNum());
    }
}
