package cerc;

public class Cerc {

    double radius;

    // Var 1: cu setter pentru radius
//    public double circleArea() {
//        return 2 * Math.PI * radius * radius;
//    }

//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    // Var 2: cu parametru in circleArea()

    public double circleArea(double radius) {
        return 2 * Math.PI * radius * radius;
    }
}
