package clasatv;

public class Main {

    /**Clasa TV
     Crearea unui televizor care memoreaza numarul canalului corect, volumul curent si daca este aprins sau nu.
     Televizorul se poate aprinde si stinge.
     Daca apelam urmatoarele operatii cu televizorul stins nu se va intampla nimic
     schimbare canalui la un numar specific
     urmatorul canal (schimbarea canalului urmator) //Daca numarul urmatorului canal atinge numarul maxim(100) urmatorul canal va fi canalul cu nr 1
     canalul precedent (schimbarea canalui precedent) daca canalul precedent este 0 atunci vom seta canalul curent la ultimul canal
     marirea volumului (volumul se mareste cu 1 daca a ajuns la maximul(50) atunci acesta nu se mai mareste)
     micsorearea volumui  (volumul se micsoreaza cu 1 daca am ajuns la minimul 0) atunci acesta nu se mai micsoreaza


     TV suporta numere de canale de la 1 la 100 de canale
     TV suporta volum de la 0 la 50;**/

    public static void main(String[] args) {
        TV smartTV = new TV();

        smartTV.On();

        smartTV.nextChannel();

        smartTV.changeChannel( 53);

        smartTV.volumeUp();
    }
}
