package inlamning57;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inlamning57 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Skriv in romerska siffror");
    String temp = in.nextLine();
    //System.out.println(RomerskaSiffror.valueOf(temp).getValue());
    // MAN FÅR HA TVÅ RETURNSATSER OM MAN HAR EN IF-SATS!
    System.out.println(temp);
    int abc [] = RomerskaMetoder.makeArrayWithRomerskaNummer(temp);
    RomerskaMetoder.kontrolleraRomerskaSiffror(abc);


  }
  }
/*
//en metod som tittar så att allt hänger ihop
//tittar 2 sista eller första och vad den har
//får max vara 1/10 om den skall komma innan och max 3 X
XXXIII

  //GÖRMETOD SOM KOLLAR OM 4 LIKA
  IV
MCMXCVIIII
int sum = 0;

}
//DCCCCLXXXXIX
//CMXCIX
//X<M>C>X*/