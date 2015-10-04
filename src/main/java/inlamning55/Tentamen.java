package inlamning55;

public class Tentamen {
	String[] max = { "Max von Sydow", "23", "G" };
	String[] bo = { "Bo Ko", "12", "IG" };
	String[] stina = { "Stina Lind", "51", "VG" };

	public String getPerson(String[] name) {
		String all ="";
		for (String n : name) {
			all += n;
		}
		return all;
	}

}
