package building;

import java.util.ArrayList;

public class Floor {

    private int floorNr;
    private ArrayList<Apartment> apartments = new ArrayList<>();

    public Floor(int floorNr) {
        this.floorNr = floorNr;
    }

    public void addApartment(Apartment ap) {
        apartments.add(ap);
    }

    public int getFloorNr() {
        return floorNr;
    }

    public void setFloorNr(int floorNr) {
        this.floorNr = floorNr;
    }

    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(ArrayList<Apartment> apartments) {
        this.apartments = apartments;
    }
}
