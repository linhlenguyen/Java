import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Console c = System.console();
    if (c == null) {
       System.err.println("No console.");
       System.exit(1);
    }
    printHelp();

    List<Shape> myShapes = new ArrayList<Shape>();
    while(true){
        String input = c.readLine();
        checkInput(input);
        String[] tokens = input.split(" ");
        List<Double> doubles = new ArrayList<Double>();
        for (int i = 0; i < tokens.length; i++){
          if (tryParseDouble(tokens[i])){
            doubles.add(Double.parseDouble(tokens[i]));
          }
        }
        if (doubles.size() < 3 || doubles.size() > 4) {
          System.out.println("Detected " + Integer.toString(doubles.size()) + " number(s)\nPlease enter 3 numbers for circle and 4 numbers for cylinder");
        }
        else if (doubles.size() == 3){
          myShapes.add(new Circle(doubles.get(0), doubles.get(1), doubles.get(2)));
        }
        else if (doubles.size() == 4){
          myShapes.add(new Cylinder(doubles.get(0), doubles.get(1), doubles.get(2), doubles.get(3)));
        }
        printShapes(myShapes);
    }
  }

  private static boolean tryParseDouble(String value) {
     try {
         Double.parseDouble(value);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
  }

  private static void printHelp(){
    System.out.println("Enter your shapes.\nEnter 'Q' to quit, Enter 'H' to see this message again\nTo enter a circle insert 3 numbers for x, y and radius\nTo enter a cylinder insert 4 numbers for x, y, radius and height\nUse ' ' to seprate the numbers");
  }

  private static void printShapes(List<Shape> shapes){
    if (shapes.size() == 0){
      System.out.println("Nothing");
    }
    else {
      System.out.println("Shape entered:");
      for (int i = 0; i < shapes.size(); i ++){
        Shape s = shapes.get(i);
        System.out.println(s.getName() + " " + s.toString());
      }
    }
  }

  private static void checkInput(String input){
    if (input.equals("Q") || input.equals("q")){
      System.out.println("Terminating.. Thanks!");
      System.exit(0);
    }
    if (input.equals("H") || input.equals("h")){
      printHelp();
    }
  }
}
