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

    public String getFamilyName() {
        return familyName;
    }

}
