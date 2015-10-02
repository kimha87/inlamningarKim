/**
 * Kim Hammar
 * Inlämning 5.4
 * Ett program som läser upp flaggor samt dess färg
 */
package inlamning54;

public class Inlamning54 {
  public static void main(String[] args) {
    // Instansierar ett nytt objekt av klassen flagga
    Flagga flags = new Flagga();
    // Loop som räknar upp landen i ordning
    for(int i = 0; i<5; i++) {
      System.out.println(flags.getCountry(i) + flags.getColors(i));
    }
    System.exit(0);
  }

}
