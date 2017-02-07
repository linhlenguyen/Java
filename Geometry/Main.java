public class Main{
  private List<Shape> myShapes;

  public static void main(String[] args) {
    Console c = System.console();
    if (c == null) {
       System.err.println("No console.");
       System.exit(1);
    }
    printHelp();

    this.myShapes = new ArrayList<Shape>();
    while(true){

    }
  }

  private static void printHelp(){
    System.out.println("Enter your shapes.\n
                        Enter 'R' to see results, Enter 'Q' to quit, Enter 'H' to see this message again\n
                        To enter a circle insert 3 numbers for x, y and radius\n
                        To enter a cylinder insert 4 numbers for x, y, radius and height\n
                        Use ' ' to seprate the numbers");
  }

  private static void printShapes(){
    for (int i = 0; i < this.myShapes.size(); i ++){
      System.out.println("Shape entered:")
      System.out.println(myShapes.get(i).toString());
    }
  }

  private static void checkInput(String input){
    if (input.equals("Q") || input.equals("q")){
      printShapes();
      System.out.println("Terminating.. Thanks!");
      System.exit(0);
    }
    if (input.equals("R") || input.equals("r")){
      printShapes();
    }
    if (input.equals("H") || input.equals("h")){
      printHelp();
    }
  }
}
