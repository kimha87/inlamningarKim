package inlamning57;

public enum RomerskaSiffror {
  I(1),
  V(5),
  X(10),
  L(50),
  C(100),
  D(500),
  M(1000);
  
  private int value;
  private String letter;
  
  private RomerskaSiffror (int value) {
    this.value = value;
  //this.letter = letter;
  }
  public int getValue() {
    return value;
  }
  

}
