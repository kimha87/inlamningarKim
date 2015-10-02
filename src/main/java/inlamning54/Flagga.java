package inlamning54;

public class Flagga {
  // En jagged array med namn samt färger för flaggor
  String[][] country = { { "Sverige", "USA", "Italien", "Danmark", "Tyskland" },
      { "blå gul", "röd vit blå", "grön röd vid", "röd vid ", "gul röd svart" } };
  // Metod som hämtar landet samt gör att dom får samma längd med hjälp av "space"
  public String getCountry(int loop) {
    String countryName = country[0][loop];
    int countryNameLength = 15 - countryName.length();
    for (int i = 0; i < countryNameLength; i++) {
      countryName += " ";
    }
    return countryName;
  }

  // Metod för att hämta färgerna
  public String getColors(int i) {
    return country[1][i];
  }
}