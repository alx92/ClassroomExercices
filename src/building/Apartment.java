package building;

public class Apartment {

    private int apNr;
    private String familyName;

    public Apartment(int apNr, String familyName) {
        this.apNr = apNr;
        this.familyName = familyName;
    }

    public int getApNr() {
        return apNr;
    }

    public void setApNr(int apNr) {
        this.apNr = apNr;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
