package inlamning55;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    Scanner in = new Scanner(System.in);
    
    int [] gradeLimits = new int[2];
    
    System.out.println("Ange maxpo�ng: ");
    int maxPoints = in.nextInt();
    System.out.println("Hur m�nga studenter vill du mata in?");
    int howManyStudents = in.nextInt();
    System.out.println("Ange betygsgr�ns f�r G: ");
    int gLimit = in.nextInt();
    System.out.println("Ange betygsgr�ns f�r VG: ");
    int vgLimit = in.nextInt();
    
    String [] students = new String[howManyStudents];
    int [] grade = new int [howManyStudents];
    
    System.out.println("Ange skrivningens namn (unikt): ");
    String textPath = in.next();
    PrintWriter pelle = new PrintWriter("src/main/java/inlamning55/" + textPath +".txt");

    
    for (int i = 0; i < howManyStudents; i++){
      System.out.println("Ange namn: ");
      students[i] = in.next();
      for (int j = i; j < i + 1; j++){
        System.out.println("Ange Po�ng: ");
        while(true) { // G�r try catch
          int points = in.nextInt();
          if (points > 0 || points < maxPoints) {
            grade[j] = points;
            break;
          } else {
            System.out.println("Felaktigt v�rde");
          }
        }
      }
    }
    double avgPoints = 0;
    for (int i = 0; i < howManyStudents; i++) {
      avgPoints += grade[i];
    }
    Tentamen tent = new Tentamen(gLimit, vgLimit);
    pelle.println("Resultat f�r " + textPath);
	pelle.println("Maxpo�ng: " + maxPoints);
	pelle.println("G gr�ns: " + gradeLimits[0] );
	pelle.println("VG gr�ns: " + gradeLimits[0]);
	pelle.printf("%s%20s%25s\n", "Namn", "Po�ng", "Betyg");
	pelle.println("========================================");
	for (int i = 0; i < howManyStudents; i++) {
		pelle.printf("%s%20d%25s" , students[i], grade[i], tent.getGrade(grade[i]));
	}
    pelle.println("Medelpo�ng: " + avgPoints/howManyStudents);
    pelle.close();
    
  }

}
