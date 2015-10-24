package inlamning55;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Inlamning55v2 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(System.in);
    Calendar c = Calendar.getInstance();
    DateFormat date = new SimpleDateFormat("yyMMdd");
    int [] gradeLimits = new int[2];
    
    System.out.println("Ange maxpoäng:");
    int maxPoints = in.nextInt();
    
    System.out.println("Hur många elever vill du betygsätta?");
    int numberOfStudents =  in.nextInt();
    
        
    System.out.println("Ange gräns för G:");
    gradeLimits[0] = in.nextInt();
    
    System.out.println("Ange gräns för VG:");
    gradeLimits[1] = in.nextInt();
   
    System.out.println("Ange filnamn");
    String fileName = in.next();
    
    System.out.println("Vill du lägga till dagens datum? tryck 'j' och enter för ja");
    String wantDateOrNot = in.next();
    if (wantDateOrNot.matches("j")) {
      fileName += date.format(c.getTime());
    }
    
    PrintWriter path = new PrintWriter("scr/main/java/inlamning55" + fileName +".txt");
    int counter = 1;
    for (int i = 0; i < numberOfStudents; i++) {
      students[i] = in.nextLine();
      System.out.println("Ange namn för studerande nummer: " + counter);
      System.out.println("Ange betyg för studerande nummer: " + counter);
      testScore[i] = in.nextInt();
      counter ++;
    }
    
  }

}
