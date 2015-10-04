package inlamning55;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Inlamning55 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter resultat = new PrintWriter("src/main/java/inlamning55/resultat.txt");
		resultat.println("Resultat Skriv3cMatte141001");
		resultat.println("Maxpoäng 60");
		resultat.println("G gräns 20");
		resultat.println("VG gräns 40");
		resultat.println("Namn				Poäng	Betyg");
		resultat.println("========================================");
		Tentamen tent = new Tentamen();
		resultat.println(tent.getPerson(tent.max));
		resultat.println(tent.getPerson(tent.bo));
		resultat.println(tent.getPerson(tent.stina));
		resultat.close();
		System.exit(0);
		
		
	}

}
