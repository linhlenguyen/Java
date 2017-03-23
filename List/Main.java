import java.io.*;

public class Main{
  private static LinkedList dataSource;
  private static int inputType;

  public static void main(String[] args){
    StringList stringList = new StringList();
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("!");

    IntegerList intList = new IntegerList();
    intList.add(1);
    intList.add(14);
    intList.add(8);
    intList.add(51);
    intList.remove(1);
    intList.remove(14);
    intList.remove(3);

    System.out.println(stringList.showList());
    System.out.println(intList.showList());
    return;
  }

  private static void processInput(String command){
    if (command.equals(":s")){
      dataSource = new LinkedList<String>();
      inputType = 0;
      dataSource.printList();
      return;
    }
    if (command.equals(":i")){
      dataSource = new LinkedList<Integer>();
      inputType = 1;
      dataSource.printList();
      return;
    }
    if (inputType == 0){
      dataSource.addItem(command);
    }
    else if (inputType == 1){
      if (tryParseInt(command)){
        dataSource.addItem(Integer.parseInt(command));
      }
    }
    return;
  }

  private static boolean tryParseInt(String value) {
     try {
         int i = Integer.parseInt(value);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
  }
}
