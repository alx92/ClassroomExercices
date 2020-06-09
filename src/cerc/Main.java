package cerc;

public class Main {
    /**Crearea unui cerc care contine un membru de tip double
     * numit raza si are o metoda prin care obtinem aria cercului.**/
    public static void main(String[] args) {
        Cerc circle = new Cerc();
        // circle.setRadius(5);
        // System.out.println(circle.circleArea());
        System.out.println(circle.circleArea(5));
    }
}
