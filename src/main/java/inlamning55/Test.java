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
    
    System.out.println("Ange maxpoäng: ");
    int maxPoints = in.nextInt();
    System.out.println("Hur många studenter vill du mata in?");
    int howManyStudents = in.nextInt();
    System.out.println("Ange betygsgräns för G: ");
    int gLimit = in.nextInt();
    System.out.println("Ange betygsgräns för VG: ");
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
        System.out.println("Ange Poäng: ");
        while(true) { // Gör try catch
          int points = in.nextInt();
          if (points > 0 || points < maxPoints) {
            grade[j] = points;
            break;
          } else {
            System.out.println("Felaktigt värde");
          }
        }
      }
    }
    double avgPoints = 0;
    for (int i = 0; i < howManyStudents; i++) {
      avgPoints += grade[i];
    }
    Tentamen tent = new Tentamen(gLimit, vgLimit);
    pelle.println("Resultat för " + textPath);
	pelle.println("Maxpoäng: " + maxPoints);
	pelle.println("G gräns: " + gradeLimits[0] );
	pelle.println("VG gräns: " + gradeLimits[0]);
	pelle.printf("%s%20s%25s\n", "Namn", "Poäng", "Betyg");
	pelle.println("========================================");
	for (int i = 0; i < howManyStudents; i++) {
		pelle.printf("%s%20d%25s" , students[i], grade[i], tent.getGrade(grade[i]));
	}
    pelle.println("Medelpoäng: " + avgPoints/howManyStudents);
    pelle.close();
    
  }

}
