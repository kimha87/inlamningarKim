package inlamning55;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Inlamning55 {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		PrintWriter pelle = new PrintWriter("resultat.txt");
		pelle.println("Resultat Skriv3cMatte141001");
		pelle.println("Maxpoäng 60");
		pelle.println("G gräns 20");
		pelle.println("VG gräns 40");
		pelle.println("Namn				Poäng	Betyg");
		pelle.println("========================================");
		Tentamen tent = new Tentamen();
		pelle.println(tent.getPerson(tent.max));
		pelle.println(tent.getPerson(tent.bo));
		pelle.println(tent.getPerson(tent.stina));
		pelle.close();
		System.exit(0);
		
		
	}

}
