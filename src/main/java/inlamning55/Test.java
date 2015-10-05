package inlamning55;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
    gradeLimits[0] = in.nextInt();
    System.out.println("Ange betygsgr�ns f�r VG: ");
    gradeLimits[1] = in.nextInt();
    
    String [] students = new String[howManyStudents];
    int [] grade = new int [howManyStudents];
    
    System.out.println("Ange skrivningens namn (unikt): ");
    String textPath = in.next();
    PrintWriter pelle = new PrintWriter(textPath);
    
    for (int i = 0; i < howManyStudents; i++){
      System.out.println("Ange namn: ");
      students[i] = in.next();
      for (int j = i; j < i + 1; j++){
        System.out.println("Ange Po�ng: ");
        while(true) {
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
    int avgPoints = 0;
    for (int i = 0; i < howManyStudents; i++) {
      avgPoints += grade[i];
    }
    System.out.println(avgPoints/howManyStudents);
    
    
  }

}
