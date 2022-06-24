package TinderLike;

import java.util.*;

public class Utente implements Comparable <Utente> {
    //private List<Interesse> listInteressi;
    private HashSet<Interesse> listInteressi;
    private boolean isMale;           // Melvin <3
    private boolean likeSausages;
    private String Nickname;
    private String realName;
    private int eta;
    private int sizeCommonLikes;


    public int getSizeCommonLikes() {
        return sizeCommonLikes;
    }

    public void setSizeCommonLikes(int sizeCommonLikes) {
        this.sizeCommonLikes = sizeCommonLikes;
    }


    public Utente( String nickname, String realName,boolean isMale, int eta) {
        listInteressi = new HashSet<>();
        this.isMale = isMale;
        Nickname = nickname;
        this.realName = realName;
        this.eta = eta;
    }
    public void putInteressi (List<Interesse> a){
        listInteressi.addAll(a);
    }


    public HashSet<Interesse> getListInteressi() {
        return listInteressi;
    }

    public void setListInteressi(HashSet<Interesse> listInteressi) {
        this.listInteressi = listInteressi;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }


    public boolean LikeSausages() {
        if (isMale)
            likeSausages = false;
        else likeSausages= true;
        return likeSausages;
    }



    @Override
    public int compareTo(Utente o) {
        if (o.getSizeCommonLikes() < 1) {
            return o.Nickname.compareTo(this.Nickname);}
        else if (o.getSizeCommonLikes() > this.getSizeCommonLikes())
            return 1;
            if (this.getSizeCommonLikes() == o.getSizeCommonLikes())
                return 0;
            else return -1;


    }


    @Override
    public String toString() {
        return  Nickname;

    }
}
