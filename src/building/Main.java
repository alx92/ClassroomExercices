package building;

public class Main {

    public static void main(String[] args) {

        Building building = new Building("E2");

        Floor floor0 = new Floor(0);
        Floor floor1 = new Floor(1);

        Apartment ap1 = new Apartment(1, "Fam. Ionescu");
        floor0.addApartment(ap1);

        Apartment ap2 = new Apartment(2, "Fam. Popescu");
        floor0.addApartment(ap2);

        Apartment ap3 = new Apartment(3, "Fam. Georgescu");
        floor1.addApartment(ap3);

        Apartment ap4 = new Apartment(4, "Fam. Vladimirescu");
        floor1.addApartment(ap4);

        Apartment ap5 = new Apartment(5, "Fam. Tutulescu");
        floor1.addApartment(ap5);

        building.addFloor(floor0);
        building.addFloor(floor1);

        //ArrayList<Floor> floors = building.getFloors();

        building.printB();

//        for (Floor floor : floors) {
//            System.out.println("-----------------------------------");
//            System.out.println("-----------------------------------");
//            System.out.print("et-" + floor.getFloorNr() + ":");
//
//            ArrayList<Apartment> apartments = floor.getApartments();
//
//            for (Apartment apartment : apartments) {
//
//                System.out.print("||" + apartment.getApNr() +
//                        ". " + apartment.getFamilyName() + " || ");
//            }
//            System.out.println();
//            System.out.println("-----------------------------------");
//            System.out.println("-----------------------------------");
//        }
    }
}