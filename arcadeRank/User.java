package arcadeRank;

public class User implements Comparable<User> {
    private String username;
    private long id;
    private long score;



    private long gameNum;
    public User(String username, long id) {
        this.username = username;
        this.id = id;
    }

    public long getGameNum() {
        return gameNum;
    }

    public void setGameNum(long gameNum) {
        this.gameNum = gameNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score =  score;
    }
    @Override
    public int compareTo(User o) {

        return Long.compare(o.getScore(),this.getScore());

        /*if (o.getScore() < this.getScore()){
            return -1;
        }
        else if (o.getScore()>this.getScore()) {
            return 1;
        }
        return 0;*/
    }

    public int compareTo2 (User o){
        return Long.compare(o.getGameNum(),this.getGameNum());
    }

    @Override
    public String toString() {
        return  username + ':' +score;
    }
}
