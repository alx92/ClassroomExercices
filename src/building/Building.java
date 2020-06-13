package building;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Floor> floors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public Building(String name) {
        this.name = name;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

}
