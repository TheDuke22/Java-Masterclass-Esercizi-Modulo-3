package TinderLike;

public class Interesse {
    private int interesseID;
    private String interesse;

    public Interesse(int interesseID, String interesse) {
        this.interesseID = interesseID;
        this.interesse = interesse;
    }

    public int getInteresseID() {
        return interesseID;
    }

    public void setInteresseID(int interesseID) {
        this.interesseID = interesseID;
    }

    public String getInteresse() {
        return interesse;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {
        return  interesse;
    }

}

