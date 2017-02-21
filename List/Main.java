import java.io.*;

public class Main{
  public static void main(String[] args){
    LinkedList<String> stringList = new LinkedList();
    stringList.addItem("Hello");
    stringList.addItem("World");
    stringList.addItem("!");

    LinkedList<Integer> intList = new LinkedList();
    intList.addItem(1);
    intList.addItem(14);
    intList.addItem(8);
    intList.addItem(51);
    intList.remove(1);
    intList.remove(14);

    System.out.println(stringList.printList());
    System.out.println(intList.printList());
    return;
  }
}
