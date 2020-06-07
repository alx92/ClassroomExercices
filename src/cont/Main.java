package cont;

public class Main {

    /**(Clasa Cont) Proiectați o clasă numită Cont care conține:
     ■ Un câmp de date de int privat numit id pentru cont (implicit 0).
     ■ Un câmp double de date privat numit sold pentru cont (implicit 0).
     ■ Un câmp double de date private numit anualInterestRate care stochează rata dobânzii curente (implicit 0). Presupunem că toate conturile au aceeași rată a dobânzii.
     ■ Un câmp de date private Date numit dateCreated care stochează data la care
     contul a fost creat.
     ■ Un constructor fără argument care creează un cont implicit.
     ■ Constructor care creează un cont cu ID-ul specificat și soldul inițial.
     ■ Metodele de acesare și de mutare pentru ID, sold și anualInterestRate.
     ■ Metoda de acesare pentru dateCreated.
     ■ O metodă numită getMonthlyInterestRate () care returnează lunar
     rata dobânzii.
     ■ O metodă numită retragere care retrage o sumă specificată din
     cont.
     ■ Metodă numită depozit care depune o sumă specificată în cont.**/

    public static void main(String[] args) {

        Cont cont = new Cont(123456, 0);

        cont.deposit(100000);

        cont.setAnnualInterestRate(6.3);

        double monthlyInterest = cont.getMonthlyInterestRate();

        System.out.println("Monthly interest for deposit " + cont.getSold() + " is: " + monthlyInterest);

        System.out.println("Account created at: " + cont.getDateCreated());

    }
}
