package cont;

import java.util.Date;

public class Cont {

    private int id;
    private double sold;
    private double annualInterestRate;
    private long time = System.currentTimeMillis();

    private Date dateCreated;

    public Cont() {
        dateCreated = new Date(time);
    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
        time = System.currentTimeMillis();
        dateCreated = new Date(time);
    }

    public int getId() {
        return id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSold() {
        return sold;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            sold += amount;
        }
        else System.out.println("Amount not valid!");
    }

    public double getMonthlyInterestRate() {
        return sold * annualInterestRate / 12;
    }
}
