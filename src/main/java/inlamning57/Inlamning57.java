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
    // MAN F�R HA TV� RETURNSATSER OM MAN HAR EN IF-SATS!
    System.out.println(temp);
    int abc [] = RomerskaMetoder.makeArrayWithRomerskaNummer(temp);
    RomerskaMetoder.kontrolleraRomerskaSiffror(abc);


  }
  }
/*
//en metod som tittar s� att allt h�nger ihop
//tittar 2 sista eller f�rsta och vad den har
//f�r max vara 1/10 om den skall komma innan och max 3 X
XXXIII

  //G�RMETOD SOM KOLLAR OM 4 LIKA
  IV
MCMXCVIIII
int sum = 0;

}
//DCCCCLXXXXIX
//CMXCIX
//X<M>C>X*/