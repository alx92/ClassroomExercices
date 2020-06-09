package dreptunghi;

public class Rectangle {

    private double width = 1; // latime
    private double length = 1; // lungime

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }


    // Daca folosim constructor fara parametrii, atunci trebuie sa putem atribui
    // valori la lungime si latime prin settere pentru cei doi membri ai clasei.
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
