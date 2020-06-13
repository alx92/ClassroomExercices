package building;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Floor> floors = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public Building(String name) {
        this.name = name;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void printB() {
        for (Floor floor : floors) {
            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
            System.out.print("et-" + floor.getFloorNr() + ":");

            ArrayList<Apartment> apartments = floor.getApartments();

            for (Apartment apartment : apartments) {

                System.out.print("||" + apartment.getApNr() +
                        ". " + apartment.getFamilyName() + " || ");
            }
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
        }
    }

}
