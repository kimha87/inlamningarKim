package inlamning57;

public class RomerskaMetoder {
  private static int sum = 0;
  private static int lastRepeated = 0;
  private static int counter = 0;
  private static int lastUsedDigit = 0;
  private static int currentLowestNumber = 0;

  public static int[] makeArrayWithRomerskaNummer(String letters) {
    int[] abc = new int[letters.length() + 3];
    for (int i = 0; i < letters.length() + 3; i++) {
      if (i < 3) {
        abc[i] = 0;
      } else {
        String temp = letters.substring(0 + i - 3, 1 + i - 3);
        RomerskaSiffror.valueOf(temp);
        abc[i] = RomerskaSiffror.valueOf(temp).getValue();
      }
    }
    return abc;
  }/*
    * public static String subWord(String romerskaNumberToConvert){ for (int i =
    * 0; i < romerskaNumberToConvert.length()-1; i++) { String subString =
    * romerskaNumberToConvert.substring(romerskaNumberToConvert.length()-2-i,
    * romerskaNumberToConvert.length()-i-1); i =
    * checkCorrect(subString.indexOf(0),subString.indexOf(1), i); } }
    */

  public static void kontrolleraRomerskaSiffror(int[] romerskaNumberToConvert) {
    for (int i = 0; i < romerskaNumberToConvert.length - 3; i++) {
      // int [] subarray = {
      // romerskaNumberToConvert[romerskaNumberToConvert.length-1-i],romerskaNumberToConvert[romerskaNumberToConvert.length-i]};
      i += checkCorrect(romerskaNumberToConvert[romerskaNumberToConvert.length - 4 - i],
          romerskaNumberToConvert[romerskaNumberToConvert.length - 3 - i],
          romerskaNumberToConvert[romerskaNumberToConvert.length - 2 - i],
          romerskaNumberToConvert[romerskaNumberToConvert.length - 1 - i]);
      if (i < 0) {
        sum = 0;
        System.out.println("Gör om och skriv rätt!");
        break;
      }
    }
    if (sum > 0) {
      System.out.println(sum);
    }
  }

  public static int checkCorrect(int zero, int first, int second, int third) {

    if ((zero == second && first == third) || (zero == third && first == second)
        || (third > second && (second >= first && first != 0)) || (third < second && first == third)) {
      System.out.println("Bad input");
      return -999999999;
    } else if (second >= third) {
      
      if (currentLowestNumber > third) {
        return -99999999;
      }
      sum += third;
      currentLowestNumber = third;
      if ((lastRepeated == 5 && third == 5) || (lastRepeated == 50 && third == 50) 
          || (lastRepeated == 500 && third == 500)) {
        System.out.println("Du får int uppretpa DLV");
        return -99999999;
      }
      if (lastRepeated == third && lastRepeated != 1000 && lastRepeated != 0) {
        counter++;
        if (counter > 4) {
          System.out.println("FÖR MÅNGA REPEATS!!! FÖRSÖK IGEN");
          return -99999999;
        }
      }
      lastRepeated = third;

      return 0;
    } else if ((second >= (third / 10) && second < third) || second == 0) {
      if (currentLowestNumber > third || (lastRepeated == 5 && third - second == 9)) {
        System.out.println("NO UGLY WRITEPLEASE");
        return -99999999;
      }
      sum += (third - second);
      currentLowestNumber = third-second;
      if ((lastRepeated == 5 && third == 5) || (lastRepeated == 50 && third == 50) 
          || (lastRepeated == 500 && third == 500)) {
        System.out.println("TOO MANY FIVESN");
        return -99999999;
      }
      if (third == 5 || third == 50 || third == 500) {
        lastRepeated = third;
      }
      return 1;
    } else {
      System.out.println("GÖR OMMMMM");
      return -99999999;
    }
  }
}

// Om nästa är större änXCXC om 1<2
