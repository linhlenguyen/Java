import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Console c = System.console();
    if (c == null) {
       System.err.println("No console.");
       System.exit(1);
    }

    System.out.println("Welcome to virtual dice throwing game. Enter 'Q' to quit.");
    while (true){
      Dice myDice = readDice(c);
      System.out.println(throwDice(c, myDice));
    }
  }

  private static Dice readDice(Console c){
    while (true){
      String sideStr = c.readLine("Enter the number of side of the dice\n");
      checkInput(sideStr);
      if (tryParseInt(sideStr)){
        return new Dice(Integer.parseInt(sideStr));
      }
      else {
        System.out.println("Not a valid integer!");
      }
    }
  }

  private static String throwDice(Console c, Dice myDice){
    while (true){
      String tStr = c.readLine("How many time would you like to throw the dice?\n");
      checkInput(tStr);
      if (tryParseInt(tStr)){
        int t = Integer.parseInt(tStr);
        if (t % myDice.numberOfSide != 0){
          System.out.println("Number of throw must be multiples of side!");
          continue;
        }
        else {
          return myDice.throwDiceStr(t);
        }
      }
      else {
        System.out.println("Not a valid integer!");
      }
    }
  }

  private static void checkInput(String input){
    if (input.equals("Q") || input.equals("q")){
      System.out.println("Thanks for playing!");
      System.exit(0);
    }
  }

  private static boolean tryParseInt(String value) {
     try {
         int i = Integer.parseInt(value);
         if (i <= 0) return false;
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
  }
}
