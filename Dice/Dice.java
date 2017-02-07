import java.util.Random;

public class Dice{
  public int numberOfSide;

  public Dice(int numberOfSide){
    this.numberOfSide = numberOfSide;
  }

  public int[] throwDice(int t){
    int[] occurences = new int[this.numberOfSide + 1];
    Random rand = new Random();
    for (int i = 0; i < t; i++){
      int side = rand.nextInt(this.numberOfSide) + 1;
      occurences[side]++;
    }
    return occurences;
  }

  public String throwDiceStr(int t){
    int[] occurences = throwDice(t);
    String r = "";
    for (int i = 1; i < occurences.length; i++){
      r += "Side " + Integer.toString(i) + ": " + occurences[i] + "; ";
    }
    return r;
  }
}
