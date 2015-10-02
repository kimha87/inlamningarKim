package inlamning54;

public class Flagga {
  // En jagged array med namn samt f�rger f�r flaggor
  String[][] country = { { "Sverige", "USA", "Italien", "Danmark", "Tyskland" },
      { "bl� gul", "r�d vit bl�", "gr�n r�d vid", "r�d vid ", "gul r�d svart" } };
  // Metod som h�mtar landet samt g�r att dom f�r samma l�ngd med hj�lp av "space"
  public String getCountry(int loop) {
    String countryName = country[0][loop];
    int countryNameLength = 15 - countryName.length();
    for (int i = 0; i < countryNameLength; i++) {
      countryName += " ";
    }
    return countryName;
  }

  // Metod f�r att h�mta f�rgerna
  public String getColors(int i) {
    return country[1][i];
  }
}